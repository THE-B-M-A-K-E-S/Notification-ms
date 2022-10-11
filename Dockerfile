FROM openjdk:17
EXPOSE 8084
ADD target/notifs-ms.jar notifs-ms.jar
ENTRYPOINT ["java", "-jar", "notifs-ms.jar"]