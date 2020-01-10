FROM tomcat:8.0.51-jre8-alpine

RUN mkdir TMSytem_Project

COPY target/spring*.war /TMSytem_Project/TMSytem_Project.war

EXPOSE 5060

CMD ["catalina.sh","run"]
