function Movie(givenId, givenTitle, givenRating) {
    this.id = givenId;
    this.title = givenTitle;
    this.rating = givenRating;
}

Movie.prototype.showDetails = function () { /* anonymous function */
    console.log("Movie Details: ");
    console.log("ID: " + this.id);
    console.log("Title: " + this.title);
    console.log("Rating: " + this.rating);
}

var movRef = new Movie(1, "The Godfather", 5);
movRef.showDetails();

var movie = JSON.stringify(movRef);
console.log(movie);

var movie1 = JSON.parse(movie);
console.log(movie1);

var movie2 = "{\"id\":2, \"title\":\"The Godfather: Part II\", \"rating\":4}";
var movieObj = JSON.parse(movie2);
console.log(movieObj);

movieObj.toString = function () {
    return this.id + " " + this.title + " " + this.rating;
}
console.log(movieObj.toString());


var movRef1 = new Movie("2", "The Godfather: Part II", 4);
movRef1.showDetails();