FROM java:8-jre
MAINTAINER "Shashank <shashank022@gmail.com>"

RUN mkdir TMSytem_Project
COPY target/spring*.jar /TMSytem_Project/TMSytem_Project.jar
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/TMSytem_Project/TMSytem_Project.jar"]

