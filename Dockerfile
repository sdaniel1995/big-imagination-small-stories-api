# Base OS or Image
FROM openjdk:11

# Set the working directory for any subsequent ADD, COPY, CMD, ENTRYPOINT, 
# or RUN instructions that follow it in the Dockerfile.
WORKDIR /opt

# Set the environment variable key to the value.
ENV PORT 8081

# Define the network ports that this container will listen on at runtime.
EXPOSE 8081

# Copy jar files from local machine to Docker Container
COPY build/libs/tic-tac-toe-api-0.0.1-SNAPSHOT.jar /opt/app.jar

# Configures the container to be run as an executable.
ENTRYPOINT ["java","-jar","/opt/app.jar"]