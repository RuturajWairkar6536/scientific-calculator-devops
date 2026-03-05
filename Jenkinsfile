pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main', url: 'https://github.com/RuturajWairkar6536/scientific-calculator-devops.git'
            }
        }

        stage('Unit Testing') {
            steps {
                sh 'javac Calculator.java'
                echo "Unit test stage executed"
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

    post {

        success {
            emailext(
                subject: "Jenkins Build SUCCESS",
                body: "Scientific Calculator pipeline completed successfully.",
                to: "Ruturaj.Wairkar@iiitb.ac.in"
            )
        }

        failure {
            emailext(
                subject: "Jenkins Build FAILED",
                body: "The Jenkins pipeline failed. Please check console output.",
                to: "Ruturaj.Wairkar@iiitb.ac.in"
            )
        }
    }
}
