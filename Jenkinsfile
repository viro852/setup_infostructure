pipeline {
    agent any

    tools {
        jdk "javalocal"
        maven "MavenLocal"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/viro852/setup_infostructure_project.git'


                // To run Maven on a Windows agent, use
                 bat "mvn clean test"

            }


        }
    }
}