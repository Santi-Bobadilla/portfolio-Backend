FROM openjdk:17-jdk-alpine
MAINTAINER santiagobobadilla
COPY target/backend-1.0.0.jar backend-1.0.0.jar 
ENTRYPOINT ["java","-jar","/backend-1.0.0.jar"]