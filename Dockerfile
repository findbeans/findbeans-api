FROM openjdk:8-jdk-alpine

MAINTAINER Zhang Yangming "283796265@qq.com"

WORKDIR /data

COPY out/findbeans-0.0.1.jar /
RUN mkdir -p /data/findbeans \
    && mv /findbeans-0.0.1.jar /data/findbeans/findbeans.jar

EXPOSE 8080

ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /data/findbeans/findbeans.jar" ]