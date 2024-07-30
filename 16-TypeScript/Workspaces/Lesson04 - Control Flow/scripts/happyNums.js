var first5HappyNumbers = findFirstNHappyNumbers(5);
console.log(first5HappyNumbers);
function findFirstNHappyNumbers(n) {
    var happyNumbers = [];
    var currentNumber = 10;
    while (happyNumbers.length < n) {
        if (isHappyNumber(currentNumber)) {
            happyNumbers.push(currentNumber);
        }
        currentNumber++;
    }
    return happyNumbers;
}
function isHappyNumber(n) {
    var seen = [];
    while (n !== 1 && !seen.includes(n)) {
        seen.push(n);
        n = sumOfSquaresOfDigits(n);
    }
    return n === 1;
}
function sumOfSquaresOfDigits(n) {
    var sum = 0;
    while (n > 0) {
        var digit = n % 10;
        sum += digit * digit;
        n = Math.floor(n / 10);
    }
    return sum;
}
