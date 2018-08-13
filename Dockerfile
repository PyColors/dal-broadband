FROM openjdk:8-jre-alpine

EXPOSE 8080

RUN mkdir -p /aws && \
        apk -Uuv add groff less python py-pip && \
	pip install awscli && \
	apk --purge -v del py-pip && \
	rm /var/cache/apk/* && \ 
        mkdir -p /apps/appdynamics/ && \
        mkdir -p /apps/jtc/ && \
        mkdir -p /apps/jtc-config/ && \
        mkdir -p /apps/stub-files/

ADD appdagent.tar /apps/appdynamics/
ADD infrastructure/jtc-download.sh /apps/jtc/

ARG MSNAME
ENV MSNAME=$MSNAME
ARG VERSION
ENV VERSION=$VERSION

COPY $MSNAME-svc-$VERSION.jar /apps/sb/

RUN chmod +x /apps/jtc/jtc-download.sh

ENTRYPOINT ["/apps/jtc/jtc-download.sh"]