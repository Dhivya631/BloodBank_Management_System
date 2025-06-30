FROM openjdk:17-jdk-slim

WORKDIR /app

COPY dist/BloodBankManagement.jar bloodBank.jar

CMD ["java", "-jar", "bloodBank.jar"]

