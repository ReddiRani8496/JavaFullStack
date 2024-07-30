abstract class Shape {
    abstract RectangleArea(length: number, breadth: number): number;
    abstract SquareArea(side: number): number;
    abstract CircleArea(radius: number): number;
}

class Area extends Shape {
  
    RectangleArea(length: number, breadth: number): number {
        return length * breadth;
    }

    SquareArea(side: number): number {
        return side * side;
    }

    CircleArea(radius: number): number {
        return Math.PI * radius * radius;
    }
}

const areaCalculator = new Area();

const rectangleLength = 5;
const rectangleBreadth = 10;
const squareSide = 4;
const circleRadius = 7;

console.log(`Area of Rectangle: ${areaCalculator.RectangleArea(rectangleLength, rectangleBreadth)}`);
console.log(`Area of Square: ${areaCalculator.SquareArea(squareSide)}`);
console.log(`Area of Circle: ${areaCalculator.CircleArea(circleRadius)}`);
