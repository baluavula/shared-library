import com.kotitechs.builds.Calculator
// library('com.prasadtechz.slb')
def call(Map pipelineparams){
    Calculator calc = new Calculator(this)
    pipeline {
        agent any
        environments {
            APP_NAME = "${pipelineparams.appName}" // this is the  value comes from microservices
          //  FNumber = "${pipelineparams.FirstNumber}"
          //  SNumber = "${pipelineparams.SecondNumber}"
        }
        stages {
            stage('caluculator'){
                steps {
                    scripts {
                        echo "printing the two varibales:"
                        echo "addition result" ${calc.add(3, 2)}
                        echo "dummy  orint"
                        echo "Microservice name is: ${env.APP_NAME}"
                    }
                }
            }
        }
    }
}
