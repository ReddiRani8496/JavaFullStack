var givenNumber = new Number(10000000.324);
console.log(givenNumber);

var numberFormat = Intl.NumberFormat("en-us",{
    style : "currency",
    currency : "USD",
    maximumFractionDigits : 2
});

var convertedResult = numberFormat.format(givenNumber);
console.log(convertedResult);