pipeline{
	
	agent any

	tools {
		maven  'Maven'
	}

	parameters {
        string(name: 'BRANCH_NAME', defaultValue: 'master', description: 'Which Git branch to build?')
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
	
	
	stage('deploy'){
		
		steps{
			
			bat '''
			
			        echo checking if port 8080 is running ....
			        
			        for /f "tokens=5" %%a in ('netstat -ano ^| findstr :8080 ^| findstr LISTENING' ) do (
						
						echo killing process with PID %%a
						
						taskkill /F /PID %%a
						
					)
			
			     exit 0
			'''
			
			
			
			
		
			
			bat '''
			
			echo Creating Deploy folder if not exist
			
			if not exist C:\\deploy mkdir C:\\deploy
			
			
			echo Copy war file from target folder to Deploy folder
			
			copy target\\jenkinstest-0.0.1-SNAPSHOT.war C:\\deploy\\jenkinstest.war
			
			echo Now going to deploy Springboot Application...
			
			echo Starting Spring Boot Application...
            start "" java -jar C:\\deploy\\jenkinstest-0.0.1-SNAPSHOT.jar > C:\\deploy\\springboot.log 2>&1


			
			'''
			
		}
	}
		
		
		
	}
	
	
	post {
		
		
		success {
			//cleanWs()
			echo 'Build Succeeded'
		}
		
		failure{
			
			echo 'Build Failed'
		}
		
	}
	
	
}
