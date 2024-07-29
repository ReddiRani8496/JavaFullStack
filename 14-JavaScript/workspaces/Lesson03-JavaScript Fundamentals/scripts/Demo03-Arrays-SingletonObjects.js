// Arrays in js
var courses = ["Java","JavaScript Essentials","HTML","TypeScript","Node","Angular"];
var students = [10, 15, 10, 15, 10, 20];

// Heterogenous arrays in js
var numbers = ["one",2,3,'four','five',6.0];
console.log(numbers.length);
numbers.pop();
console.log(numbers.length);

// Singleton Objects[Object on the go]
var course = {
    name:"javascript",
    students:5,
    frequency:'daily'
};
console.log(course.frequency);
console.log(course.students);
console.log(course.name);

var myObject = {
    name:'Ring',
    diameter:12,
    specs:{
        material:"Wood",
        waterProof:false
    }
};

console.log(myObject.name);
console.log(myObject.diameter);
console.log(myObject.specs.material);

// Accessing object attributes using off operator
console.log(myObject["diameter"]+"\t"+myObject["specs"]["waterProof"]);
console.log(myObject["specs"]["waterProof"]);

// Accessing array elements
console.log(numbers[0]);
console.log(numbers[10]);
