FROM openjdk:17-jdk-slim
WORKDIR /app
COPY springboot-app/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
