// class creation without class syntax [using constructor look and feel]

function Moive(givenId,givenTitle,givenRating) {
    this.id = givenId;
    this.title = givenTitle;
    this.rating = givenRating;
    this.display = displayDetails; // Associating methods to the class
};



function displayDetails() {
    console.log("Movie Details: ");
    console.log("ID : " + this.id);
    console.log("Title : " + this.title);
    console.log("Rating : " + this.rating);
}

var mov1Ref = new Moive(1,"ABC","Awesome");
mov1Ref.display();