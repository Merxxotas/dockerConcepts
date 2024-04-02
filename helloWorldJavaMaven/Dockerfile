# Traer la imagen oficial de maven con el jdk respectivo
FROM maven:3.8.7-openjdk-18-slim as build

# Set the working directory for the build
WORKDIR /MainJavaMaven

# Copy the Maven project files into the container
COPY pom.xml .
COPY src ./src

# Package the application (this will also compile the Java code)
RUN mvn package -Dmaven.test.skip=true

# Use the official OpenJDK image for the runtime stage
FROM openjdk:23-slim-bullseye

# Copy the JAR file from the build stage to the runtime container
COPY --from=build /MainJavaMaven/target/*.jar /MainJavaMaven/MainJavaMaven.jar

# Set the working directory for the runtime
WORKDIR /MainJavaMaven

# Especificar el volumen donde se usará
VOLUME /javaMaven

# Command to run the Java application
CMD ["java", "-jar", "MainJavaMaven.jar"]
