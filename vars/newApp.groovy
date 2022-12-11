def uber(String repoUrl){
    pipeline{
        agent any
        stages{
            stage('1-build'){
                steps{
                    sh 'free -g'
                }
            }
            stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
            }
            stage('3-monitor'){
                steps{
                    sh 'lscpu'
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