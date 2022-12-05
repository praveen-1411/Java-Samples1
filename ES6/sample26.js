class user{
    constructor(name){
        this.name = name;
    }

    getName(){
        return this.name;
    }
}


let obj = new user("John Doe");
console.log(obj.getName());