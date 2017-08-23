FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/findbeans-0.0.1.jar /
RUN mkdir /home/findbeans \
    && mv /findbeans-0.0.1.jar /home/findbeans/findbeans.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /home/findbeans/findbeans.jar" ]