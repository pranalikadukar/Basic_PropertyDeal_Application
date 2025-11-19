# Stage 1: Build the WAR using Maven
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /app

# Copy only necessary files
COPY pom.xml .  
COPY src ./src  

# Build the WAR file
RUN mvn clean package -DskipTests

# Stage 2: Run with Tomcat
FROM tomcat:9.0-jdk17
WORKDIR /usr/local/tomcat

# Remove default webapps
RUN rm -rf webapps/*

# Copy WAR from build stage into Tomcat webapps
COPY --from=build /app/target/*.war webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh", "run"]
