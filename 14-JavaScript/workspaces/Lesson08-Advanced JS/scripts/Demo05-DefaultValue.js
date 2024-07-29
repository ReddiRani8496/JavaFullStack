function sayHi(greet) {
    greetMsg = greet || "This is a default value";
    console.log(greetMsg);
}

sayHi();
sayHi("Good Morning!");
sayHi(null);
sayHi(false);