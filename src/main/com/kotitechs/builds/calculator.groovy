package com.kotitechs.builds

//all methods
def jenkins
class Calculator implements Serializable {
    Calculator(jenkins){ // this is a  constructor
        this.jenkins = jenkins
    }

// addition methods
def add(def FirstNumber, def SecondNumber){
    return FirstNumber + SecondNumber
}

// substarction method
def sub(def FirstNumber, def SecondNumber){
    return FirstNumber - SecondNumber
}
}
