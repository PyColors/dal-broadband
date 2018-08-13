#!/bin/sh

echo ${jtclocation}/${jtcfilename}
aws s3 cp s3://${jtclocation}/${jtcfilename} .
tar -C /apps/jtc-config -xf ./${jtcfilename}
rm -f ./${jtcfilename}

java ${JAVA_OPTS} -jar /apps/sb/${MSNAME}-svc-${VERSION}.jar