FROM openjdk:17-alpine
COPY target/Department-Service-0.0.1-SNAPSHOT.jar app.jar
CMD ["Department-Service", "app.jar"]
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "/app.jar"]