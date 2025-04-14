def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git" 
}
def gitBuild()
{
  sh 'mvn package'
}
def gitdeploy(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}
def gittesting(repo)
{
    git "https://github.com/IntelliqDevops/${repo}.git" 
}
def gitdelivery(jobname,ip,context)
{
    sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}


