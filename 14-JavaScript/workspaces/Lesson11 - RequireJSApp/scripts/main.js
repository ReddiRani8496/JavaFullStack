require(['./team','./coach'], function(teamRef, coachRef){
    alert("Welcome our fav coach, "+coachRef.coachName);
    teamRef.displayDetails();
});