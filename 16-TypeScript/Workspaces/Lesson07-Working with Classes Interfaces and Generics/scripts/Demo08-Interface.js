var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.prototype.draw = function () {
        console.log("Drawing a circle");
    };
    Circle.prototype.describe = function () {
        console.log("Circle is round in shape");
    };
    Circle.prototype.erase = function () {
        console.log("Erase the circle");
    };
    return Circle;
}());
var circle1 = new Circle();
circle1.draw();
circle1.describe();
circle1.erase();
