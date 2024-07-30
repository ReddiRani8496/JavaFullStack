// Number specific Datatypes
var ageLimit = 21;
var colorCode = 0x3434;
var octalCode = 156;
var binaryCode = 59;
// string specific Datatypes
var empName = "Rahul";
var empDept = "Admin";
// Boolean Type
var isMovie = true;
// void usage
function sayHello() {
    console.log("helloo everyone...");
}
// Null type and undefined type
var tempNumber = undefined;
var tempObj;
//Any type of data
var value1 = "Hello";
value1 = 234;
value1 = true;
// BigInt datatypes
var big1 = BigInt(100);
//let big2:bigint = 100n;
console.log(big1);
// Never
function throwException(errMsg) {
    throw new Error(errMsg);
}
throwException("You made some mistake");
function alwaysDoSomething() {
    while (true) {
        console.log("I am always on the Go");
    }
}
