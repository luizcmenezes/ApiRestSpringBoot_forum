FROM openjdk

WORKDIR /app

COPY target/forum-0.0.1-SNAPSHOT.jar /app/forum-spring-app.jar

ENTRYPOINT ["java", "-jar", "forum-spring-app.jar"]