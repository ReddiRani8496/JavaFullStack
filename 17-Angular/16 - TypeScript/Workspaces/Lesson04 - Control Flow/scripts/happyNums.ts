const first5HappyNumbers = findFirstNHappyNumbers(5);
console.log(first5HappyNumbers);

function findFirstNHappyNumbers(n: number): number[] {
    let happyNumbers = [];
    let currentNumber:number = 10;
    while (happyNumbers.length < n) {
        if (isHappyNumber(currentNumber)) {
            happyNumbers.push(currentNumber);
        }
        currentNumber++;
    }
    return happyNumbers;    
}

function isHappyNumber(n: number): boolean {
    let seen = [];
    while (n !== 1 && !seen.includes(n)) {
        seen.push(n);
        n = sumOfSquaresOfDigits(n);
    }
    return n === 1;
}


function sumOfSquaresOfDigits(n: number): number {
    let sum = 0;
    while (n > 0) {
        let digit = n % 10;
        sum += digit * digit;
        n = Math.floor(n / 10);
    }
    return sum;
}







