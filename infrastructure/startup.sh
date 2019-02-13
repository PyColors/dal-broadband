#!/bin/sh

echo ${JtcLocation}/${JtcFilename}
aws s3 cp s3://${JtcLocation}/${JtcFilename} --region eu-west-1 .
tar -C /apps/jtc-config -xf ./${JtcFilename}
rm -f ./${JtcFilename}

JAVA_OPTS="-Xmx${XMX} -Xms${XMS}"

if [[ "${AppDFlag}" == "true" ]]; then
  JAVA_OPTS="${JAVA_OPTS} -javaagent:/apps/appdynamics/appdagent/javaagent.jar -Dappdynamics.controller.hostName=${Hostname} -Dappdynamics.controller.port=${AppDPort} -Dappdynamics.controller.ssl.enabled=true -Dappdynamics.agent.applicationName=${AppDEnv} -Dappdynamics.agent.tierName=${MSNAME} -Dappdynamics.agent.nodeName=${Environment}-${MSNAME} -Dappdynamics.agent.reuse.nodeName=true -Dappdynamics.agent.reuse.nodeName.prefix=${Environment}-${MSNAME} -Dappdynamics.jvm.shutdown.mark.node.as.historical=true -Dappdynamics.agent.accountAccessKey=${AppDKey}"
fi

if [[ "${DdogFlag}" == "true" ]]; then
  JAVA_OPTS="${JAVA_OPTS} -javaagent:/apps/datadog/dd-java-agent.jar"
  export DD_SERVICE_NAME=${MSNAME}
  export DD_AGENT_HOST=$(curl --retry 5 --connect-timeout 3 -s 169.254.169.254/latest/meta-data/local-ipv4)
  export DD_JMXFETCH_ENABLED="true"
fi

java $JAVA_OPTS -jar /apps/sb/${MSNAME}-svc-${VERSION}.jar
