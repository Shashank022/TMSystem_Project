FROM tomcat:8.0.51-jre8-alpine
EXPOSE 5060
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/*.war /usr/local/tomcat/webapps/TMSytem_Project.war
CMD ["catalina.sh","run"]