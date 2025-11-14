FROM maven:3.9.6-eclipse-temurin-21 AS builder

WORKDIR /build

COPY pom.xml .
COPY src ./src

RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY --from=builder /build/target/auth-ai-0.0.1-SNAPSHOT.jar /app/auth-ai.jar

EXPOSE 8080

CMD ["java", "-jar", "/app/auth-ai.jar"]
