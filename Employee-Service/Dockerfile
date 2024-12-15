FROM openjdk:17-alpine
COPY target/discovery-service.jar app.jar
CMD ["Employee-Service", "app.jar"]
ENTRYPOINT ["java", "-jar", "/app.jar"]