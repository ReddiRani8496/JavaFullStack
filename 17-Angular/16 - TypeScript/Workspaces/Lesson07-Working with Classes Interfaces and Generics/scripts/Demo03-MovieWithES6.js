class Movie {
    constructor(givenId, givenTitle, givenRating) {
        this.id = givenId;
        this.title = givenTitle;
        this.rating = givenRating;
    }
    displayDetails = function () {
        console.log("Movie Details:");
        console.log("ID :" + this.id);
        console.log("Title: " + this.title);
        console.log("Rating: " + this.rating);
    };
    
}
var mov1Ref = new Movie(1001, "ABC", "Awesome");
    mov1Ref.displayDetails();