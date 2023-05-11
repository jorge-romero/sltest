def call(body){

    pipeline {
        agent {
            label "windows"
        }
        stages {
            stage("init"){
                steps{
                       powershell returnStatus: true, returnStdout: true, script: '''Write-Host \'Hello, World!\''''
                }
            }
        }
    }

}