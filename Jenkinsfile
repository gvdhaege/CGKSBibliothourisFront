pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat './gradlew.bat clean build'
            }
        }

        stage('Test') {
            steps {
                bat './gradlew.bat test || 0'
            }
        }
    }

    post {
        always {
            junit '**/build/test-results/test/*.xml'
            step( [ $class: 'JacocoPublisher' ] )
        }
    }
}