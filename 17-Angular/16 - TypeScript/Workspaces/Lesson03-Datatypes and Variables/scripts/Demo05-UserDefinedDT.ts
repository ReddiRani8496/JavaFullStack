class Employee {
    id:number;
    empName:string;
    constructor(givenEmpId:number, givenEmpName:string) {
        this.id = givenEmpId;
        this.empName = givenEmpName;
    }

    displayDetails():void {
        console.log("Employee Details:");
        console.log("Emp ID: " + this.id);
        console.log("Emp Name: " + this.empName);
    }
}

interface Shape {
    draw():any;
}

class Circle implements Shape {
    draw() {
        console.log("Drawing a circle..");
        
    }
}



enum Season{
    Summer,Autumn,Winter,Rainy
}

console.log(Season.Summer);

