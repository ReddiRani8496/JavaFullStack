function addTen(num) {
    if (typeof num === 'string') {
        return "after adding 10 to ".concat(num, " is: ").concat(10 + parseInt(num));
    }
    else if (typeof num === 'number') {
        return "after adding 10 to ".concat(num, " is: ").concat(10 + num);
    }
    else {
        return "enter either number or string";
    }
}
var number1 = "10";
console.log(addTen(number1));
