// class creation without class syntax [using constructor look and feel]

function Moive(givenId,givenTitle,givenRating) {
    this.id = givenId;
    this.title = givenTitle;
    this.rating = givenRating;
};

// Adding a method to the class using Prototype syntax
Moive.prototype.display = function() {
    console.log("Movie Details: ");
    console.log("ID : " + this.id);
    console.log("Title : " + this.title);
    console.log("Rating : " + this.rating);
}

var mov1Ref = new Moive(1,"ABC","Awesome");
mov1Ref.display();