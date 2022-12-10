pipeline {
    agent any
    environment {
        DOCKERHUB_CREDENTIALS = credentials('dockerHub')
    }

    stages {
        stage('Git')  {
            steps {
                echo 'Getting Backend project from Git';
                 git branch:'main',
                 url: 'https://github.com/m521/DevOpsRattrapage.git'
           }
        }
        
        
        
         stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
         stage('compile') {
            steps {
                sh 'mvn compile'
          }
        }
         stage('SONARQUBE') {
            steps {
                sh 'mvn sonar:sonar  -Dsonar.login=admin -Dsonar.password=sonar'
            }
        }
        
         stage('Junit') {
            steps {
           
                sh 'mvn test'  
                }
            }

          stage('clean and package') {
            
            steps {
                sh 'mvn clean package'  
            }
     
            }
         stage('NEXUS'){
            steps{
                sh 'mvn deploy -DskipStaging=true'
            }
        }
        
        
        
 	stage("Building Docker Image") {
                steps{
                    sh 'docker build -t $DOCKERHUB_CREDENTIALS_USR/train .'
                }
        }
	stage("Login to DockerHub") {
                steps{
                    sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR -p $DOCKERHUB_CREDENTIALS_PSW'
                }
        }
	stage("Push to DockerHub") {
                steps{
                    sh 'docker push $DOCKERHUB_CREDENTIALS_USR/train'
                }
        }
	stage("Docker-compose") {
                steps{
                    sh 'docker compose up -d '
                }
        }

         

         
    
       
    }    
   
}
