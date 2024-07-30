function addNumbers() {
    var args = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        args[_i] = arguments[_i];
    }
    var sum = 0;
    for (var _a = 0, args_1 = args; _a < args_1.length; _a++) {
        var i = args_1[_a];
        sum += i;
    }
    console.log(sum);
}
addNumbers(1, 2, 4, 5, 3);
