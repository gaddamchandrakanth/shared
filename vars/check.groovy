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
  sh "scp /var/lib/jenkins/workspace/declarativepipeline/webapp/target/webapp.war ubuntu@172.31.47.202:/var/lib/tomcat10/webapps/check.war"
}
def gittesting(repo)
{
    git "https://github.com/IntelliqDevops/${repo}.git" 
}

