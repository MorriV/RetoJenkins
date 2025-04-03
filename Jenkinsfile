pipeline {
    agent { label 'agent1' }

    environment {
        IMAGE_NAME = 'morri/todoapp:latest' // cámbialo si tienes Docker Hub
    }

    stages {
        stage('Clonar') {
            steps {
                echo 'Clonando proyecto desde GitHub...'
            }
        }

        stage('Compilar con Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Construir imagen Docker') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Finalizado') {
            steps {
                echo 'Pipeline finalizado correctamente.'
            }
        }
    }
}
