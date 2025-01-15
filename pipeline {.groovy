pipeline {
    
    agent any
    environment{
        pass=credentials('DOCKER_PASSWORD')
    }
    stages {
        stage('Clone Repository') {
            steps {
                // Get some code from a GitHub repository
                git branch:'main', url:'https://github.com/Git-JagdishSingh/flask-app.git'

                }
    }
    stage('Build Docker Image') {
        steps {
            sh ' docker build -t flask-app .'
        }
    }
    //stage('Run image') {
      //  steps{
      //  sh 'docker run -p 5000:5000 flask-app'
       // }
    //}
    stage('Push to Docker Hub') {
        steps{
            sh '''
                    echo 'hello user'
                   echo $pass | docker login -u jagdishsingh31 --password-stdin
                   docker tag flask-app jagdishsingh31/devops
                   docker push jagdishsingh31/devops
             '''
        }
    }
}
}
