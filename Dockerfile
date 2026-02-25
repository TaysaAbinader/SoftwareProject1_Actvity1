# Use an official Maven image as a parent image
FROM maven:3-eclipse-temurin-25

# Set metadata information
LABEL authors="taysa"

# Set the working directory in the container
WORKDIR /src

# Copy the pom.xml file to the container
COPY pom.xml /src/

# Copy the entire project to the container
COPY . /src/

# Package your application
RUN mvn package

# Run the main class (assuming your application has a main class)
CMD ["java", "-jar", "target/TemperatureConverter.jar", "org.example.Main"]
