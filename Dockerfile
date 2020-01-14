FROM tomcat:8.0.51-jre8-alpine

RUN mkdir TMSystem_Project

ADD target/TMSystem_Project.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 5060

CMD ["catalina.sh","run"]

