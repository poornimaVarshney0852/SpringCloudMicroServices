FROM openjdk:17-alpine
COPY target/Service-Registry-0.0.1-SNAPSHOT.jar app.jar
CMD ["service-registry", "app.jar"]
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app.jar"]