
FROM amazoncorretto:21-alpine-jdk
WORKDIR /app
COPY target/Job-App.jar Job-App.jar
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -Dserver.port=${PORT:-8080} -jar Job-App.jar"]
