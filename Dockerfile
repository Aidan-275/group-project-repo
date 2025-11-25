FROM amazoncorretto:17

WORKDIR /app

COPY target/sem.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar", "db:3306", "30000"]
