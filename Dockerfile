FROM java:8
RUN mkdir -p /app
COPY ./target/springboot-testapp-0.0.1-SNAPSHOT.jar /app
COPY ./external.properties /app
CMD ["java","-jar","/app/springboot-testapp-0.0.1-SNAPSHOT.jar","--spring.config.location=/app/external.properties"]