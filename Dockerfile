FROM tomcat:8.0.51-jre8-alpine

RUN mkdir TMSysstem_Project

COPY target/spring*.war /TMSytem_Project/TMSystem_Project.war

EXPOSE 5060

CMD ["catalina.sh","run"]
