FROM amazoncorretto:11-alpine-jdk
MAINTAINER bayro
COPY target/Enterprise-0.0.1-SNAPSHOT.jar /Enterprise.jar
ENTRYPOINT ["java","-jar","/Enterprise.jar"]

