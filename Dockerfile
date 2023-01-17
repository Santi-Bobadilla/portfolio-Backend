FROM amazoncorretto:17-alpine-jdk
EXPOSE 8080
MAINTAINER santiagobobadilla
COPY target/backend-1.0.0.jar backend-1.0.0.jar 
ENTRYPOINT ["java","-jar","/backend-1.0.0.jar"]