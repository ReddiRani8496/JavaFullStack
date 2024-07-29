let bill = document.getElementById("tipTotlaBill");
let people = document.getElementById("tipNumOfPeople");
let btn = document.getElementById("tipBtn");

btn.addEventListener("click",()=>{
    let total =parseFloat(bill.value);
    let totalPeople =parseInt(people.value);
    let discount = 0.1;
    let totalAmount = total + (total)*discount;
    let eachPerson = parseFloat(totalAmount/totalPeople);
    if(isFinite(eachPerson)){
        document.getElementById("output").innerHTML="<p>Total bill = " + totalAmount +"<br> Each Person should pay: "+ eachPerson+"</p>";
    } else if(isNaN(eachPerson)) {
        document.getElementById("output").innerHTML="<p>Enter valid numbers</p>";
    } else {
        document.getElementById("output").innerHTML="<p>Can not divide by zero</p>";
    }
});