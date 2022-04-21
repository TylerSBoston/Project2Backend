def buildNumber = env.BUILD_NUMBER as int
if (buildNumber > 1) milestone(buildNumber - 1)
milestone(buildNumber)
// stops previous instance if its built but forever looping - code above

pipeline {
    agent any

	
    // medium has 2 cores and still responds during delayed/timedout sessions
   //     options {
     //   timeout(time: 5, unit: 'MINUTES')   // timeout on whole pipeline job
   // }
	

    	
        stages {
   	
            
   	
      
        
        stage('Clone') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/TylerSBoston/Project2Backend'
                sh "docker volume prune -f"
				
                echo 'clone step'
            }
        }
        stage('Build') {
            steps {
                
                withMaven(
			        maven: 'springversion'
	   			 ) {
	                sh "mvn clean package -DskipTests "
				}
                echo 'build step'
            }
        }
        stage('Stage') {
            steps {
               	echo 'deploy step'
               	
               	
               	sh "docker-compose down"
               	
               // removes previous image, as jenkins keeps reusing a previous build instead of a new one otherwise.
               	sh "docker image rm -f javalin-backend"
              // 	sh "docker image rm maven"
               	
               	sh "docker-compose up -d"
            }
        }
    }
}