pipeline {
    agent any

 //   tools {
        // Install the Maven version configured as "M3" and add it to the path.
     //   maven "/usr/share/maven"
  //  }
    
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
               	sh "docker-compose up -d"
            }
        }
    }
}