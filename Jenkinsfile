pipeline {
   agent any

   tools {
      // Install the Maven version configured as "M3" and add it to the path.
      maven 'maven'
   }

   stages {
      stage('Build') {
         steps {
            // Get some code from a GitHub repository 
           
            sh "mvn -Dmaven.test.failure.ignore=true clean compile"
         }
         }
      stage("Test") {
          steps {
              
            sh "mvn -Dmaven.test.failure.ignore=true clean test"
            
          }

      }
      stage("Deploy") {
          steps {
             
            sh "mvn -Dmaven.test.failure.ignore=true clean install"
            
          }
          post {
              success {
                  archiveArtifacts 'target/*.jar'
                  java -jar target/*.jar
              }

          }


      }

      }
   }
