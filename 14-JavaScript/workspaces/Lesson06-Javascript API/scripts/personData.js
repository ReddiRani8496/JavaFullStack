var data = "John,Doe,32,1982,10,23,153.25, A";

var res = data.split(",");

var person = {
    firstname : res[0],
    lastname : res[1],
    age : res[2],
    year : res[3],
    month : res[4],
    date : res[5],
    salary : res[6],
    grade : res[7].trim()
};

console.log("First Name: " + person.firstname);
console.log("Last Name: " + person.lastname);
console.log("Age : " + person.age);
console.log("Date of Birth: " + person.date + "-" + person.month + "-" + person.year);
console.log("Salary : " + person.salary);
console.log("Grade : " + person.grade);