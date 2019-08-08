#!/usr/bin/groovy

def slack(String buildresult)
{
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "good", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful"
  }
  else( buildResult == "FAILURE" ) { 
    slackSend color: "danger", message: "Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed"
  }
}

def email(String buildresult)
{
  if ( buildResult == "SUCCESS" ) {
    mail to: 'abhishek.dubey@opstree.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) was success",
    body: "Please go to ${BUILD_URL} and verify the build"
    
  }
  else ( buildResult == "FAILURE" ) { 
    mail to: 'abhishek.dubey@opstree.com',
    subject: "Job '${JOB_NAME}' (${BUILD_NUMBER}) was failed",
    body: "Please go to ${BUILD_URL} and verify the build"
  }
}
