pipeline {
    agent any


    
        options {
        timeout(time: 5, unit: 'MINUTES')   // timeout on whole pipeline job
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
               	
               	// images keep data from first build so........
               	
           //    	sh "docker image rm javalin-backend"
            //   	sh "docker image rm postgres"
           //    	sh "docker image rm openjdk"
              // 	sh "docker image rm maven"
               	
               	sh "docker-compose up"
            }
        }
    }
}