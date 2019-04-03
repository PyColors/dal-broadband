FROM openjdk:8-jre-alpine

EXPOSE 8080

RUN mkdir -p /aws && \
    apk -Uuv add groff less python py-pip curl && \
	pip install awscli && \
	apk --purge -v del py-pip && \
	rm /var/cache/apk/* && \ 
    mkdir -p /apps/datadog/ && \
    mkdir -p /apps/appdynamics/ && \
    mkdir -p /apps/jtc/ && \
    mkdir -p /apps/jtc-config/ && \
    mkdir -p /apps/stub-files/

ADD dd-java-agent.jar /apps/datadog/
ADD appdagent.tar /apps/appdynamics/
ADD infrastructure/startup.sh /apps/startup/

ARG MSNAME
ENV MSNAME=$MSNAME
ARG VERSION
ENV VERSION=$VERSION

COPY $MSNAME-svc-$VERSION.jar /apps/sb/

RUN chmod +x /apps/startup/startup.sh

LABEL com.datadoghq.ad.logs="[{\"source\": \"java\", \"service\": \"${MSNAME}\", \"log_processing_rules\": [\
{\"type\": \"multi_line\", \"name\": \"log_start_with_date\", \"pattern\": \"\\\d{4}-(0?[1-9]|1[012])-(0?[1-9]|[12][0-9]|3[01])\"}\
]}]
ENTRYPOINT ["/apps/startup/startup.sh"]
