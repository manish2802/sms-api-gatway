FROM eclipse-temurin:17-jre

WORKDIR /app

COPY target/sms-api-gateway-0.0.1-SNAPSHOT.jar sms-api-gateway.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","sms-api-gateway.jar"]