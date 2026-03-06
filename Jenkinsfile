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
    always {
        emailext(
            subject: "Jenkins Build: ${currentBuild.currentResult}",
            body: """
Build Status: ${currentBuild.currentResult}

Project: Scientific Calculator Pipeline
Build Number: ${env.BUILD_NUMBER}
Build URL: ${env.BUILD_URL}
""",
            to: "ruturajwairkar@gmail.com"
        )
    }
}   
}
