function greet(name, callback){
    console.log('Hi '+ '' + name);
    callback();
}

function callme(){
    console.log("I am callback function")
     
}

greet('John',callme);//passing function as a parameter