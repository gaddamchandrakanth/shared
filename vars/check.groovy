def gitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git" 
}
def gitBuild()
{
  sh "mvn package"
}

