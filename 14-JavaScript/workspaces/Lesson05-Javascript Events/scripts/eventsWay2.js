document.getElementById("speakers").onclick = showSpeakerBanner;

function showSpeakerBanner() {
    alert("section one clicked");
    let sectionEle = document.getElementById("speakers");
    sectionEle.style.fontSize = "20px";
    sectionEle.style.color = "Red";
    sectionEle.style.backgroundColor="Black";
}