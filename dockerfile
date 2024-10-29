FROM maven:3.9.2-eclipse-temurin-17 AS build
COPY . /app
WORKDIR /app
RUN mvn clean package -DskipTests
FROM eclipse-temurin:17-jdk-alpine
COPY --from=build /app/target/weather-forecast-app-0.0.1-SNAPSHOT.jar /app/weather-forecast-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/weather-forecast-app.jar"]