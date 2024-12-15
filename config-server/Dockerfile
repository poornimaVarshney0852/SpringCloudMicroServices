FROM openjdk:17-alpine
COPY target/config-server-0.0.1-SNAPSHOT.jar app.jar
CMD ["config-server", "app.jar"]
ENTRYPOINT ["java", "-jar", "/app.jar"]