import com.kotitechs.builds.calculator

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
            stage{
                steps {
                    scripts {
                        echo "printing the two varibales:"
                        println calc.add(3,2)
                        echo "Microservice name is: ${APP_NAME}"
                    }
                }
            }
        }
    }
}