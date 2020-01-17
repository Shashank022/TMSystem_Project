pipeline {
  
  agent any
  
 stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh "chmod +x './prework.sh'"
                sh "./prework.sh"
                // sh "sudo docker build -t vuejsproj:latest npm install"
            }
        }

          stage('Test') {
            steps {
                echo 'Building anotherJob and getting the log'
            }
          }
       
        stage('Deploy'){
             steps {
                 echo "This is log"
             }

        }
    }
    
}