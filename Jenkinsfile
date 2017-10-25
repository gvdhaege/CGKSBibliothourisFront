pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                bat './gradlew.bat clean testClasses'
            }
        }

        stage('Test') {
            steps {
                bat(script: './gradlew.bat test', returnStatus:true)
            }
        }

        stage('CodeCoverage') {
            steps {
                bat(script: './gradlew.bat test', returnStatus:true)
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