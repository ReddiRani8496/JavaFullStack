function A() {};

A.prototype.getName = function() {return "Proto A"};

function B(){};
B.prototype = new A();

var bRef = new B();

console.log(bRef.getName());