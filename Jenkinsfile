pipeline{
	
	agent any

	tools {
		maven  'Maven'
	}
	
	stages {
		
		
		stage('checkout'){
			
			steps{
				
				git branch: 'master' , url: 'https://github.com/Shiva3890/SpringBootJenkinsPipeLine' 
				
			}
			
		}
		
		stage('Build'){
		
		steps{
			
			bat 'mvn -B clean package'
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
