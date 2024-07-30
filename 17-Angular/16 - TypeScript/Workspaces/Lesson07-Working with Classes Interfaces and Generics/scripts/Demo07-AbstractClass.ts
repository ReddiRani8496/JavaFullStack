abstract class Vehicle {
    buy():void {
        console.log("Buying a vehicle");
    }
    
    abstract start():void;
    abstract stop():void;
}

class Car extends Vehicle {
    start(): void {
        console.log("Starting my Car");
        
    }
    stop(): void {
        console.log("Stoping my car");
        
    }
}

var carRef = new Car();
carRef.start();
carRef.stop();