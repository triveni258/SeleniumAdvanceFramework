pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'master',
                url: 'https://github.com/triveni258/SeleniumAdvanceFramework.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean test -DsuiteXmlFile=ActionPerformance.xml'
            }
        }
    }
}