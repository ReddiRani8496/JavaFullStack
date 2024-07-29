function declareVariable() {
   
    if(true) {
        var x = "declared in a block of code";
    }
    console.log("value of x: " + x);
}

declareVariable();

let arr = [1,2,3,4];
delete arr[1];
console.log(arr[1]);
arr.pop();
console.log(arr[3]);
console.log(arr[2]);