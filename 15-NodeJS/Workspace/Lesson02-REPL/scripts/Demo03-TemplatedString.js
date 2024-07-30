class Movie {
    constructor(givenId, givenTitle, givenRating) {
        this.id = givenId;
        this.title = givenTitle;
        this.rating = givenRating;

    }
    displayDetails() {
        console.log(`Id : ${this.id}, title: ${this.title}, rating: ${this.rating}`);
    }
}

var mov1Ref = new Movie(1,"ABC","Nice");
mov1Ref.displayDetails();