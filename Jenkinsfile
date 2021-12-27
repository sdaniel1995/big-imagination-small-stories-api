pipeline {
    agent {
        label 'master'
    }

    stages {
       stage('Build') {
          steps {
             updateGitlabCommitStatus name: 'Building', state: 'running'
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

    //    stage('Build Docker Image') {
    //        steps {
    //            sh 'docker build -t danielshane861/tic-tac-toe-api .'
    //        }
    //    }

    //    stage('Push Docker Image') {
    //        steps {
    //            withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerHubPwd')]) {
    //                 sh "docker login -u danielshane861 -p ${dockerHubPwd}"
    //            }   
    //            sh 'docker push danielshane861/tic-tac-toe-api'
    //        }
    //    }

    //    stage('Deploy') {
    //        steps {
    //            sshagent(['TicTacToeApi-server']) {
                   
    //                sh "ssh -o StrictHostKeyChecking=no ec2-user@172.31.18.117 docker run -d -p 8080:8080 --name=tic-tac-toe-api danielshane861/tic-tac-toe-api"
    //            }
    //        }
    //    }

       stage('Clean WorkSpace') {
           steps {
               cleanWs()
           }
       }
    }
 }