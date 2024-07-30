interface Shape {
    draw():void;
    describe():void;
    erase():void;
}

class Circle implements Shape {
    draw(): void {
        console.log("Drawing a circle");
        
    }
    describe(): void {
        console.log("Circle is round in shape");
        
    }
    erase(): void {
        console.log("Erase the circle");
                
    }
}

let circle1 = new Circle();
circle1.draw();
circle1.describe();
circle1.erase();