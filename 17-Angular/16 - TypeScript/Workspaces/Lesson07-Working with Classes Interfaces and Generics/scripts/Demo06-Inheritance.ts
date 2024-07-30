class InventoryItem {
    constructor(private codition:string, private price:number) {
        console.log("parameterised constructor from inventory item..");
        
    }
    showDetails() {
        return `Inventory Item[ Price: ${this.price},
            condition: ${this.codition}`;
    }
}

class Movie extends InventoryItem{
    constructor(givenCondition:string,givenPrice:number,private id:number,private title:string,private rating:string) {
        super(givenCondition,givenPrice);
        
    }
    showDetails() {
        var inventoryDetails = super.showDetails(); 
        return `${inventoryDetails}, Movie [id : ${this.id}
            , Title: ${this.title}, Rating: ${this.rating} ]`;   
    }
}

let mov1Ref = new Movie("Available",250,1,"ABC","Awesome");
console.log(mov1Ref.showDetails());


var baseRef:InventoryItem = new Movie("Not Available",300,2,"XYZ","Fabulous");
console.log(baseRef.showDetails());
