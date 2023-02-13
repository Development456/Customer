node {
      stage("Git Clone"){

        git branch: 'main', url: 'https://github.com/Development456/Customer.git'
      }
	stage('Build Project'){
sh "mvn clean package"
echo "Executed Successfully Project1"
	}
   
      stage("Docker build"){
        sh 'docker build -t customer .'
        sh 'docker image ls'
      }
      withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'test', usernameVariable: 'apurva', passwordVariable: 'password']]) {
        sh 'docker login -u apurva@09 -p $password'
      }
      stage("Pushing Image to Docker Hub"){
	sh 'docker tag customer apurva/customer'
	sh 'docker push apurva/customer'
      }
	stage("SSH Into Server") {
       def remote = [:]
       remote.name = 'DEV-VM'
       remote.host = '20.62.171.46'
       remote.user = 'dev_azureuser'
       remote.password = 'AHTgxKmRGb05'
       remote.allowAnyHosts = true
     }
     stage("Deploy"){
	     sh 'docker stop customer || true && docker rm -f customer || true'
	     sh 'docker run -d -p 9002:9002 --name customer customer'
     }
}
