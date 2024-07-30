class Menu {
    items:Array<String>;
    pages:number;
    
    constructor(itemList:Array<string>, totalPages:number) {
        this.items = itemList;
        this.pages = totalPages;
    }
    displayMenu():void {
        console.log("Menu for Today");
        for(let i of this.items)
            console.log(i);
    }
}

let menu1Ref = new Menu(["Dosa","Biryani"],2);
menu1Ref.displayMenu();