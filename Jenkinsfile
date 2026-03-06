pipeline {
agent any

stages {

    stage('Checkout Code') {
        steps {
            git branch: 'main', url: 'https://github.com/RuturajWairkar6536/scientific-calculator-devops.git'
        }
    }

    stage('Build with Maven') {
        steps {
            sh 'mvn clean package'
        }
    }

    stage('Build Docker Image') {
        steps {
            sh 'docker build -t ruturaj6536/sci-calc:latest .'
        }
    }

    stage('Push Docker Image') {
        steps {
            sh 'docker push ruturaj6536/sci-calc:latest'
        }
    }

    stage('Deploy with Ansible') {
        steps {
            sh 'ansible-playbook deploy.yml'
        }
    }
}

post {
    success {
        mail(
            to: "ruturajwairkar@gmail.com",
            subject: "Jenkins Build SUCCESS",
            body: "Scientific Calculator pipeline completed successfully."
        )
    }

    failure {
        mail(
            to: "ruturajwairkar@gmail.com",
            subject: "Jenkins Build FAILED",
            body: "The Jenkins pipeline failed."
        )
    }
}
}
