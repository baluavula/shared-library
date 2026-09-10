package com.kotitechs.builds

//all methods

class Calculator implements Serializable {
    def jenkins
// this is a  constructor
    Calculator(jenkins){ 
        this.jenkins = jenkins
    }

// addition methods
def add(a, b){
    return a + b
}

// substarction method
def sub(a, b){
    return a - b
}
}
