var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Shape = /** @class */ (function () {
    function Shape() {
    }
    return Shape;
}());
var Area = /** @class */ (function (_super) {
    __extends(Area, _super);
    function Area() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Area.prototype.RectangleArea = function (length, breadth) {
        return length * breadth;
    };
    Area.prototype.SquareArea = function (side) {
        return side * side;
    };
    Area.prototype.CircleArea = function (radius) {
        return Math.PI * radius * radius;
    };
    return Area;
}(Shape));
var areaCalculator = new Area();
var rectangleLength = 5;
var rectangleBreadth = 10;
var squareSide = 4;
var circleRadius = 7;
console.log("Area of Rectangle: ".concat(areaCalculator.RectangleArea(rectangleLength, rectangleBreadth)));
console.log("Area of Square: ".concat(areaCalculator.SquareArea(squareSide)));
console.log("Area of Circle: ".concat(areaCalculator.CircleArea(circleRadius)));
