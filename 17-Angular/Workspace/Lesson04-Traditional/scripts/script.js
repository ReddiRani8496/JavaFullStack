let date = new Date();

document.getElementById("date").innerHTML = date;
document.getElementById("date").style.backgroundColor="lightgray";

let isGreen = true;

let timeEle = document.getElementById("time");
timeEle.innerHTML = (isGreen && <button>This is a  button</button>)