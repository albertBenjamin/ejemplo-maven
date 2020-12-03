pipeline {
    agent any

    stages {
        stage('Compile Code') {
            steps {
					bat './mvnw.cmd clean compile -e'
            }
        }
		stage('Test Code') {
            steps {
					bat './mvnw.cmd clean test -e'
            }
        }
		stage('Jar Code') {
            steps {
					bat './mvnw.cmd clean package -e'
            }
        }
		stage('Run Jar') {
            steps {
					bat 'start mvnw.cmd spring-boot:run'
            }
        }
		stage('Testing Application') {
           steps {
			    sleep 10
				bat 'curl http://localhost:8081/rest/mscovid/estadoMundial'
			}
        }
    }
}