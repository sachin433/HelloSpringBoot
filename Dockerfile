FROM openjdk:8-alpine

LABEL maintainer="sachinkadam433@gmail.com"

COPY /demo-0.0.1-SNAPSHOT.jar /demo.jar
EXPOSE 8080

CMD ["java", "-jar", "demo.jar"]