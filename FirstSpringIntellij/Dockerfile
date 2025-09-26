FROM openjdk:8-jdk
LABEL authors="zaid"
COPY target/sb-app.jar /usr/local/
WORKDIR /usr/local
ENTRYPOINT ["java", "-jar" , "sb-app.jar"]