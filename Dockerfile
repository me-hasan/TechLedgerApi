FROM amazoncorretto:22-jdk

# Use COPY to copy the JAR file to the /app directory
COPY target/tech-ledger-blog-api.jar /app/tech-ledger-blog-api.jar

# Set the entry point to run the JAR file with Java
ENTRYPOINT ["java", "-jar", "/app/tech-ledger-blog-api.jar"]
