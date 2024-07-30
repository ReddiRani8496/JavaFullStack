function addTen(num:string|number):string {
    if(typeof num==='string') {
        return ` ${10+parseInt(num)}`;
    } else if(typeof num==='number') {
        return `${10+num}`;
    } else {
        return `enter either number or string`;
    }
}
let number1:string = "10";
console.log(addTen(number1));

function whatTime(time: string | Date): string {
    if (typeof time === 'string') {
        return `The time you provided as a string is: ${time}`;
    } else if (time instanceof Date) {
        return `The time you provided as a Date object is: ${time.toISOString()}`;
    } else {
        return "Invalid type provided";
    }
}

console.log(whatTime("07:26 UTC")); 
console.log(whatTime(new Date())); 