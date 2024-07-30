// Number specific Datatypes

var ageLimit:number = 21;
var colorCode : number = 0x3434;
var octalCode: number = 0o234;
var binaryCode : number = 0b111011;

// string specific Datatypes

let empName: string = "Rahul";
let empDept : string = "Admin";

// Boolean Type
let isMovie:boolean = true;

// void usage
function sayHello() : void {
    console.log("helloo everyone...");
}

// Null type and undefined type

let tempNumber:void = undefined;

let tempObj:String;

//Any type of data
var value1:any = "Hello";
value1 = 234;
value1 = true;

// BigInt datatypes
//let big1:bigint = BigInt(100);
//let big2:bigint = 100n;
//console.log(big1);

// Never
function throwException(errMsg:string):never {
    throw new Error(errMsg);
    
}

throwException("You made some mistake");

function alwaysDoSomething():never {
    while(true) {
        console.log("I am always on the Go");
        
    }
}