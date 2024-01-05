pipeline {
    agent any

    stages {
        stage('Fetch code from Git Repo.') {
            steps {
                git 'https://github.com/akshaypawar6066/TestProjectForJenkins'
            }
        }
        
                stage('Execute Tests on Chrome Browser') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Chrome'
            }
            post { 
        always { 
          emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''<h1> Hi Team,</h1> 
<p>Please find the details below for the build execution.<br>$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>Check console output at $BUILD_URL to view the results.<br>

Thanks!<br>
Automation Team.''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!-Customized E-mail Notification Using Jenkins Pipeline On Chrome Browser', to: 'akshaypawar6066@gmail.com'
        }
    }
    }
    
                stage('Execute Tests On FireFox Browser') {
            steps {
                bat 'mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Firefox'
            }
            
            post { 
        always { 
          emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''<h1> Hi Team,</h1> 
<p>Please find the details below for the build execution.<br>$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br>Check console output at $BUILD_URL to view the results.<br>

Thanks!<br>
Automation Team.''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS!-Customized E-mail Notification Using Jenkins Pipeline On Firefox Browser', to: 'akshaypawar6066@gmail.com'
        }
    }
    }
    
}


    
}