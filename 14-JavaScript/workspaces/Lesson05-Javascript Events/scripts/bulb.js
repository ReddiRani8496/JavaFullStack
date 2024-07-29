let onBulb = document.getElementById("On");
let image = document.getElementsByTagName("img");

onBulb.addEventListener("click",()=>{
    console.log("Button clicked");
    image.src='';
    image.src='onBulb';
});