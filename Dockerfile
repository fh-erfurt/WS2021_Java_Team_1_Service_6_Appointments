# Build Image
FROM maven:3.8.5-openjdk-11-slim as build
WORKDIR /workspace/app

# COPY POM.xml
COPY pom.xml .
# Execute maven dependencies
RUN mvn dependency:go-offline

# COPY source
COPY src src
# Jar erstellen
RUN mvn package -DskipTests

# Final Image
FROM openjdk:11.0.14.1-jre-slim
ARG DEPENDENCY=/workspace/app/target

# COPY build results
WORKDIR /app
COPY --from=build ${DEPENDENCY}/lib ./lib
COPY --from=build ${DEPENDENCY}/jas-server.jar .

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "jas-server.jar"]