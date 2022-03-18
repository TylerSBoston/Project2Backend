pipeline {
    agent any

	
    // medium has 2 cores and still responds during delayed/timedout sessions
   //     options {
     //   timeout(time: 5, unit: 'MINUTES')   // timeout on whole pipeline job
   // }
    	// right spot?

    	
        stages {
        stage('abort') {
            steps {
                // Get some code from a GitHub repository
             //      	def buildNumber = env.BUILD_NUMBER as int
			//		if (buildNumber > 1) milestone(buildNumber - 1)
			//		milestone(buildNumber)
			
			sh "docker-compose down"

                echo 'abort previous builds'
            }
        }
        
        
        
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
               	
               	
               	
               	
               	// images keep data from first build so........
               	// comment out if jenkins build fails... until a if can b eadded
               	sh "docker image rm javalin-backend"
              // 	sh "docker image rm maven"
               	
               	sh "docker-compose up"
            }
        }
    }
}