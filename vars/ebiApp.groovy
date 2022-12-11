def call('String repoUrl'){
    pipeline{
        agent any
        stages{
            stage('beginning'){
                steps{
                    echo "The start of a new demo"
                }
            }
            stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
            }
            stage('Monitor'){
                steps{
                    sh 'lscpu'
                    sh 'free -m'
                }
            }
            stage('Expression'){
                steps{
                    sh 'whoami'
                }
            }
            stage('closing'){
                steps{
                    echo "Good job"
                }
            }
        }
    }
}