FROM openjdk:latest
COPY target/spring.jar app.jar
ENTRYPOINT ["java", "-jar","app.jar"]