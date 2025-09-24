pipeline{
	
	agent {

		docker {
            image 'maven:3.9.9-eclipse-temurin-17'
            args '-v /root/.m2:/root/.m2'   // cache maven dependencies
        }
	}
	
	
	stages {
		
		
		stage('checkout'){
			
			steps{
				
				git branch: 'master' , url: 'https://github.com/Shiva3890/SpringBootJenkinsPipeLine' 
				
			}
			
		}
		
		stage('Build'){
		
		steps{
			
			sh 'mvn -B clean package'
		}
	}
		
		
		
	}
	
	
	post {
		
		always{
			cleanWs()
		}
		
		success {
			echo 'Build Succeeded'
		}
		
		failure{
			
			echo 'Build Failed'
		}
		
	}
	
	
}
