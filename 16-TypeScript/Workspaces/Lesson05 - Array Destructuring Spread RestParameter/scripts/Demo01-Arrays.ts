let arrayRef1 = [10,20,30,40,"fifty"];
console.log(typeof(arrayRef1));
console.log(arrayRef1);


// homogenous array
let arrayRef2:number[] = [10,20,30,50];

console.log(arrayRef2);

let arrayRef3 : Array<any> =[1,3,4,5,9,"five"];
 
console.log(arrayRef3);

// Array destructuring
var arr=["Welcome", "To","The","World of","typescript"]
var[firstElement,secondElement] = arr;
console.log(firstElement+"\t"+secondElement);

var[element1,,,,element5] = arr;
console.log(element1+"\t"+element5);


let colors = new Set(["White","Red","Violet","White","Black"]);
console.log(colors);

