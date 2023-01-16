FROM openjdk:17-jdk-slim-buster
COPY target/backend-1.0.0.jar backend-1.0.0.jar 
ENTRYPOINT ["java","-jar","/backend-1.0.0.jar"]