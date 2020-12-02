pipeline {
    agent any

    stages {
        stage('Compile Code') {
            steps {
				dir('C:\\Users\\AlbertMunoz\\Documents\\cursos\\devops\\ejemplo-maven'){
					bat './mvnw.cmd clean compile -e'
				}   
            }
        }
		stage('Test Code') {
            steps {
				dir('C:\\Users\\AlbertMunoz\\Documents\\cursos\\devops\\ejemplo-maven'){
					bat './mvnw.cmd clean test -e'
				}
            }
        }
		stage('Jar Code') {
            steps {
				dir('C:\\Users\\AlbertMunoz\\Documents\\cursos\\devops\\ejemplo-maven'){
					bat './mvnw.cmd clean package -e'
				}
            }
        }
		stage('Run Jar') {
            steps {
				dir('C:\\Users\\AlbertMunoz\\Documents\\cursos\\devops\\ejemplo-maven'){
					bat 'start mvnw.cmd spring-boot:run'
				}
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