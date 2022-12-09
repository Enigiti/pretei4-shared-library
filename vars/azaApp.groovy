def uber('String repoUrl'){
    pipeline{
        agent any{
            stages{
                stage('1-build'){
                    steps{
                        sh 'free -g'
                    }
                } 
                stage('closing'){
                    steps{
                        echo "new demo"
                    }
                }
            }
        }
    }
}