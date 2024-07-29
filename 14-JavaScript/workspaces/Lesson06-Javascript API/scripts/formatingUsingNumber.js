var givenNumber = new Number(10000000.324);
console.log(givenNumber);

var convertedResult = givenNumber.toLocaleString("en-us",{
    style : "currency",
    currency : "USD",
    maximumFractionDigits : 2
});

console.log(convertedResult);