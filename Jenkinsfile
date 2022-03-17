pipeline {
    agent any


    
        options {
        timeout(time: 4, unit: 'MINUTES')   // timeout on whole pipeline job
    }
    
        stages {
        stage('Clone') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/TylerSBoston/Project2Backend'

                echo 'clone step'
            }
        }
        stage('Build') {
            steps {
                
                sh "mvn clean package -DskipTests "

                echo 'build step'
            }
        }
        stage('Stage') {
            steps {
               	echo 'deploy step'
               	sh "docker-compose down"
               	// see if this effects docker-compose, doubt it
               	sleep(time:2, unit:"SECONDS")
               	sh "docker-compose up -d -t 25999999"
            }
        }
    }
}