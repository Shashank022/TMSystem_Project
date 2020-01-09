FROM java:8-jre
MAINTAINER "Shashank <shashank022@gmail.com>"

RUN mkdir TMSytem_Project
COPY target/spring*.war /TMSytem_Project/TMSytem_Project.war
EXPOSE 8080

ENTRYPOINT ["java", "-war", "/TMSytem_Project/TMSytem_Project.war"]

