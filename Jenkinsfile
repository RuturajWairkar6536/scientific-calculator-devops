pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git 'https://github.com/RuturajWairkar6536/scientific-calculator-devops.git'
            }
        }

        stage('Build Java Program') {
            steps {
                sh 'javac Calculator.java'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t ruturaj6536/sci-calc .'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh 'docker push ruturaj6536/sci-calc:latest'
            }
        }
    }
}
