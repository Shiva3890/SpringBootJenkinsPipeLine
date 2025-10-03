# Use OpenJDK 17 image
FROM eclipse-temurin:17-jdk-alpine

# Add the WAR file to the container
COPY target/jenkinstest-0.0.1-SNAPSHOT.war /app/jenkinstest.war

#Expose port 8080
EXPOSE 8080

#Run the application

ENTRYPOINT [ "java" , "-jar" , "/app/jenkinstest.war"]
