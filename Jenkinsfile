pipeline
{
    environment
    {
        registry = "dhruvin32/calculator"
        registryCredential = 'docker-hub-credentials'
        dockerImage = ''
        //dockerImageLatest = ''
    }
    agent any
    stages
    {
        stage('Pull The GitHub Repository')
        {
            steps
            {
                echo 'Pulling The Maven Git Repository'
                git ""
            }
        }

        stage("mvn clean")
        {
            steps
            {
                echo "Cleaning The Project"
                sh " mvn clean"
            }
        }
        stage("mvn test")
        {
            steps
            {
                echo "Testing The Project"
                sh "mvn test"
            }
        }
        stage("mvn package")
        {
            steps
            {
                echo "Packaging The Project"
                sh "mvn package"
            }
        }
        stage("mvn install")
        {
            steps
            {
                echo "Installing The Project"
                sh "mvn install"
            }
        }
        stage('Building Image')
        {
            steps
            {
                script
                {
                  dockerImage = docker.build registry + ":$BUILD_NUMBER"
                  //dockerImageLatest = docker.build registry + ":latest"
                }
            }
        }
        stage('Deploy Image to DockerHub')
        {
            steps
            {
                script
                {
                    docker.withRegistry( '', registryCredential )
                    {
                        dockerImage.push('latest')
                        //dockerImageLatest.push()
                    }
                }
            }
        }
        /*stage('Remove Unused docker image')
        {
            steps
            {
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }*/
        stage("Running the main Calculator file")
        {
            steps
            {
                echo "Run the Calculator"
                sh "java -cp target/spe_calculator.jar Calculator 3 + 5"
            }
        }

        stage('Deploy on Node'){
            steps {
                script {
                    step([$class: "RundeckNotifier",
                        includeRundeckLogs: true,
                        jobId: "985029a2-cb88-408d-86eb-8f260ea4d635",
                        rundeckInstance: "Rundeck",
                        shouldFailTheBuild: true,
                        shouldWaitForRundeckJob: true,
                        tailLog: true])
                }
            }
        }
    }
}
