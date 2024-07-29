function myFunction() {
    console.log(this.myProperty);
}

var myObj = {
    myProperty : 15
};

myFunction.call(myObj); // 15
myFunction.apply(myObj);

var custObj = {
    id : 23
};

myFunction.call(custObj); // 15
myFunction.apply(custObj);

/*
function myFunction() {
    console.log(this.myProperty);

    var myObj = {
    myProperty : 15
}
}

*/