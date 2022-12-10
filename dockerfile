FROM openjdk:8-jdk-alpine

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} examThourayaS2-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/examThourayaS2-0.0.1-SNAPSHOT.jar"]

EXPOSE 8089
