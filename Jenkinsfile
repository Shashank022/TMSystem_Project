pipeline {
    agent any
    tools {
        maven 'maven-3.6.2'
        jdk 'open-jdk8'
    }
    stages {
        stage('Check out git repo') {
            steps {
               git 'https://github.com/Shashank022/TMSystem_Project.git'
            }
        }
        stage('Build') {
            steps {
               sh 'mvn clean install'
            }
        }

         stage('Deploy to production') {
            steps {
                sh 'scp ./target/TMSsytem_Project.jar'
            }
        }
    }
}