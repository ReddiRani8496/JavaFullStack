var btn = document.getElementById("announceBtn");

btn.addEventListener("click",()=>{
    var nextBirthday = new Date();

    let dateOfBD = document.getElementById("dayElement").value;
    let monthOfBD = document.getElementById("monthElement").value;
    nextBirthday.setDate(parseInt(dateOfBD));
    nextBirthday.setMonth(parseInt(monthOfBD)-1);
    nextBirthday.setHours(0);
    nextBirthday.setMinutes(0);
    
    if(nextBirthday.getTime() < Date.now()) {
        nextBirthday.setFullYear(nextBirthday.getFullYear+1);
    }

    var milliseconds = nextBirthday.getTime() - Date.now();
    var hours = Math.round(milliseconds/(1000*60*60));
    var days = Math.round(hours/24);
    var result = hours + " hours (" + days +" days) left before birthday!";
    document.getElementById("dobOutput").innerHTML = result; 
})

