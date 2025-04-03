pipeline {
    agent { label 'agent1' }
    stages {
        stage('Inicio') {
            steps {
                echo '¡Pipeline iniciado desde Jenkinsfile!'
            }
        }
        stage('Comando de prueba') {
            steps {
                sh 'echo "Este es un script ejecutado por el agente Docker."'
            }
        }
    }
}
