FROM openjdk:17-jdk-slim
EXPOSE 8080
ADD target/school-app.jar school-app.jar
ENTRYPOINT ["java","-jar","/school-app.jar"]
