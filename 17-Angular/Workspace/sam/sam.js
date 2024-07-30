var colors = ["Red", "Blue"];
function fun() {
    setTimeout(function () {
        colors = ["Orange", "Yellow", "Green"];
    }, 10);
}
fun();
colors.push("White");
alert(colors);
