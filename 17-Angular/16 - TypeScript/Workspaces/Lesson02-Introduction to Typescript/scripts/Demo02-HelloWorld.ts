// let num = 10;
// console.log(num);

let welcomeMsg: string = "Welcome to Typescript!";

console.log(welcomeMsg);

//DOM Manipulation
// create a new heading h1

let heading = document.createElement("h1");
heading.innerHTML = welcomeMsg;
document.body.appendChild(heading);

