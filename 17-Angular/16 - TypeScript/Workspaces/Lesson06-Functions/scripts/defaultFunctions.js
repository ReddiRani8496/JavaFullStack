function defaultParam(num1, num2) {
    if (num2 === void 0) { num2 = 100; }
    console.log("num1: ".concat(num1, ", num2:").concat(num2));
}
defaultParam(10);
function add(n1, n2) {
    return n1 + n2;
}
function addTwoNums(a, b, sum) {
    console.log(sum(a, b));
}
addTwoNums(10, 20, add);
function stringConcat(str, num3) {
    console.log(str + num3);
}
stringConcat("Age is ", 20);
