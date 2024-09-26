# Use the official OpenJDK 21 slim image
FROM openjdk:21-jdk-slim

# Set the working directory in the container
WORKDIR /app

COPY build.gradle settings.gradle gradlew gradlew.bat ./
COPY gradle ./gradle
COPY src ./src
RUN chmod +x gradlew

# ARG to pass the built jar file to the Docker image
ARG JAR_FILE=build/libs/*.jar

# Copy the jar file from the host to the container
COPY ${JAR_FILE} app.jar

# Expose the port Spring Boot will run on
EXPOSE 8080

# Define the entry point for the container
ENTRYPOINT ["java","-jar","/app/app.jar"]