FROM openjdk:17-alpine
COPY target/API-Gateway-0.0.1-SNAPSHOT.jar app.jar
CMD ["API-Gateway", "app.jar"]
ENTRYPOINT ["java", "-jar", "/app.jar"]