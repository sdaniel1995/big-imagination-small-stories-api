pipeline {
    agent {
        label 'master'
    }

    stages {
       stage('Build') {
          steps {
             sh './gradlew clean build'
          }
       }
       
       stage('Unit Test') {
           steps {
               script {
                   sh './gradlew test'
               }
           }
       }

       stage('Build Docker Image') {
           steps {
               sh 'docker build -t danielshane861/big-imagination-small-stories-api .'
           }
       }

       stage('Push Docker Image') {
           steps {
               withCredentials([usernamePassword(credentialsId: 'DockerHub', passwordVariable: 'dockerHubPwd', usernameVariable: 'dockerHubUsername')]) {
                    sh "docker login -u danielshane861 -p ${dockerHubPwd}"
               }   
               sh 'docker push danielshane861/big-imagination-small-stories-api:api'
           }
       }

       stage('Deploy') {
            steps {
                sh 'docker rmi danielshane861/big-imagination-small-stories-api'
                script {
                    def dockerStop = 'docker stop big-imagination-small-stories-api'
                    def dockerRm = 'docker rm big-imagination-small-stories-api'
                    def dockerRmi = 'docker rmi latest'
                    def dockerRun = 'docker run -d -p 8081:8080 --name=big-imagination-small-stories-api danielshane861/big-imagination-small-stories-api:api'
                     sshagent(['AWS']) {
                        // sh "ssh -o StrictHostKeyChecking=no ec2-user@ec2-18-220-242-141.us-east-2.compute.amazonaws.com ${dockerStop}"
                        // sh "ssh -o StrictHostKeyChecking=no ec2-user@ec2-18-220-242-141.us-east-2.compute.amazonaws.com ${dockerRm}"  
                        // sh "ssh -o StrictHostKeyChecking=no ec2-user@ec2-18-220-242-141.us-east-2.compute.amazonaws.com ${dockerRmi}"
                        sh "ssh -o StrictHostKeyChecking=no ec2-user@ec2-18-220-242-141.us-east-2.compute.amazonaws.com ${dockerRun}"
                    }   
                }
            }
        }

       stage('Clean WorkSpace') {
           steps {
               cleanWs()
           }
       }
    }
 }