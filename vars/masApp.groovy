def call(String repoUrl){
    pipeline{
        agent any
        stages{
            stage('Another start'){
                steps{
                    echo "Another start"
                }
            }
            stage('Analysis'){
                steps{
                    sh 'lscpu'
                }
            }
            stage('Identity'){
                steps{
                    sh 'whoami'
                }
            }
            stage('Location'){
                steps{
                    sh 'pwd'
                }
            }
            stage('closing'){
                steps{
                    echo "well done, Pretei"
                }
            }
        }
    }
}
    
