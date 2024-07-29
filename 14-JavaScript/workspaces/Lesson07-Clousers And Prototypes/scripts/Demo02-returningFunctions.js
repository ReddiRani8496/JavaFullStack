function createIncrementByNumber(number) {
    return function(x){return number+x};
}

let inc = createIncrementByNumber(10);
// inc = function(x) {return 10+x}
console.log(inc(2)); // in the above statement it replaces x with 2
