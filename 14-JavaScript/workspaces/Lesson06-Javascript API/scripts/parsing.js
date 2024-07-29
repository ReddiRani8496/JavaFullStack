
let btn = document.getElementById("ageBtn");

btn.addEventListener("click",()=>{ 
let age = document.getElementById("ageInput");
let ageOutput = document.getElementById("ageOutput");

let ageVal = parseInt(age.value);
    ageOutput.innerText = 100-ageVal;
});