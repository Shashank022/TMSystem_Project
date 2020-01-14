FROM tomcat:8.0.51-jre8-alpine

RUN rm -rvf /usr/local/tomcat/webapps/ROOT

ADD target/TMSystem_Project.war /usr/local/tomcat/webapps/ROOT.war

CMD ["catalina.sh","run"]

