// window.addEventListener("load",function() {
//    this.alert("window is loaded"); 
// });

// window.addEventListener("load",function(){
//     this.alert("page is loaded");
//     this.document.getElementById("speakers")
//     .addEventListener("click",showSpeakerBanner)
// });
// function showSpeakerBanner() {
//     alert("speakers section is clicked");
// }

let ele = document.getElementById("speakers");
ele.addEventListener("click",()=>{
    alert("Speaker section is clicked");
});