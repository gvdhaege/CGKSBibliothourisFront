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
                try {
                    bat './gradlew.bat jacocoTestCoverageVerification'
                } catch (err) {
                    echo "Caught: ${err}"
                    currentBuild.result = 'FAILURE'
                }
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