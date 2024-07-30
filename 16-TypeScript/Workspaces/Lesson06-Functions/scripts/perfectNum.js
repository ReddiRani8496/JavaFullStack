function isPerfectNumber(num) {
    var sum = 0;
    var divisors = [];
    for (var i = 1; i < num; i++) {
        if (num % i == 0) {
            divisors.push(i);
            sum += i;
        }
    }
    if ((sum === num) && (Math.floor((sum + num) / 2) === num)) {
        console.log("Perfect Number");
    }
    else {
        console.log("Not a perfect number");
    }
}
isPerfectNumber(29);
