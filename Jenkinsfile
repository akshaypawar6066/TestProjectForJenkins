pipeline {
    agent any

    stages {
        stage('Fetch the code from Git') {
            steps {
                git 'https://github.com/Vimannagar/ATT_EveningBDDBasics.git/'
            }
        }
        
         stage('Executing project on Chrome Browser') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Chrome"
            }
            post { 
                 always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''<h1>Hi Team,</h1>
<p>Please find the details below for the build execution.<br>$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br> Check console output at $BUILD_URL to view the results.<br>

Thanks!<br>

Automation Team''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email notification by executing Pipeline on Chrome Browser', to: 'attevening@gmail.com'
        }
    }

        }
        
         stage('Executing project on Firefox browser') {
            steps {
                bat "mvn -Dmaven.test.failure.ignore=true clean test -Dclibrowser=Firefox"
            }

            post { 
        always { 
            emailext attachLog: true, attachmentsPattern: 'target/cucumber-reports/reports.html', body: '''<h1>Hi Team,</h1>
<p>Please find the details below for the build execution.<br>$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:<br> Check console output at $BUILD_URL to view the results.<br>

Thanks!<br>

Automation Team''', subject: '$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS! - Customized email notification by executing Pipeline on Firefox browser', to: 'attevening@gmail.com'
        }
    }
        }
            
    }
         
}
