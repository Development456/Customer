node {
      stage("Git Clone"){

        git branch: 'main', url: 'https://https://github.com/Development456/Customer.git'
      }
	stage('Build Project'){
sh "mvn clean package"
echo "Executed Successfully Project1"
	}
   
      stage("Docker build"){
        sh 'docker build -t customer .'
        sh 'docker image ls'
      }
      withCredentials([[$class: 'UsernamePasswordMultiBinding', credentialsId: 'test', usernameVariable: 'jsilaparasetti', passwordVariable: 'password']]) {
        sh 'docker login -u apurva@09 -p $password'
      }
      stage("Pushing Image to Docker Hub"){
	sh 'docker tag customer jsilaparasetti/customer'
	sh 'docker push jsilaparasetti/customer'
      }
	stage("SSH Into Server") {
       def remote = [:]
       remote.name = 'CLAIMS-VM'
       remote.host = '20.163.133.102'
       remote.user = 'azureuser'
       remote.password = 'Miracle@1234'
       remote.allowAnyHosts = true
     }
     stage("Deploy"){
	     sh 'docker stop customer || true && docker rm -f customer || true'
	     sh 'docker run -d -p 9002:9002 --name customer customer'
     }
}
