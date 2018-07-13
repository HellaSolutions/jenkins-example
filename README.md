Maven project with Jenkins support example

##Running and stopping Jenkins docker image 

```
docker run \
  --rm \
  -u root \
  -p 8080:8080 \
  -v jenkins-data:/var/jenkins_home \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$HOME":/home \
  jenkinsci/blueocean
```
To shutdown Jenkins
```
java -jar jenkins-cli.jar \
-s http://localhost:8080/ safe-shutdown \
--username <admin> --password <admin>
```