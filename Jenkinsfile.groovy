
pipeline{
  agent {label 'Slave'}
  
  stages{
    
    stage('code checkout'){
      steps{
      git 'https://github.com/khamruddin/sample_flutter_app.git'
    }
  }
    stage('build'){
      steps{
       sh '''
       #!/bin/bash
       flutter build apk --debug --ignore-deprectaion
       '''
      }
    }
  
  }
}
