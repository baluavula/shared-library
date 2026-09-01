package com.kotitechs.builds;

//all methods
class Calculator{
    Calculator(jenkins){ // this is a  constructor
        this.jenkins = jenkins
    }

// addition methods
def add(FirstNumber, SecondNumber){
    return FirstNumber + SecondNumber
}

// substarction method
def sub(FirstNumber, SecondNumber){
    return FirstNumber - SecondNumber
}

}