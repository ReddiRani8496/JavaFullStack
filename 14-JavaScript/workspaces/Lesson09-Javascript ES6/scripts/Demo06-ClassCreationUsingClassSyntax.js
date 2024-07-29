class Movie {
    // attributes
    //  id;
    //  title;
    //  rating;

    //constructor
    // constructor() {
    //     console.log("default constructor");
    // }

    constructor(givenId, givenTitle, givenRating) {
        this.id = givenId;
        this.title = givenTitle;
        this.rating = givenRating;
        // console.log("parameterised constructor");
    }
     
    // operations
    display() {
        console.log(this.id+" "+this.title+" "+this.rating);    
    }
    
}

let mov1Ref = new Movie();
mov1Ref.id = 1;
mov1Ref.title = "ABC";
mov1Ref.rating="Awesome";
mov1Ref.display();

let mov2Ref = new Movie(2,"KGF","Fabulous");
mov2Ref.display();