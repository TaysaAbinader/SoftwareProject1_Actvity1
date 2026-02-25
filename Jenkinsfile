pipeline {
    agent any

    tools {
        // This name must match the "Name" you gave the JDK in Jenkins Global Tool Configuration
        jdk 'JDK25'
        maven 'Maven3'
    }

    stages {
        stage('Checkout') {
            steps {
                // Added credentialsId for SSH authentication
                git url: 'git@github.com:TaysaAbinader/SoftwareProject1_Actvity1.git',
                    branch: 'main'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                sh 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit '**/target/surefire-reports/*.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}
