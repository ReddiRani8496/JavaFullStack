function totalSandwich(breads) {
    return Math.floor(breads / 2);
}
console.log(totalSandwich(10));
function totalSandwich1(breads, cheese) {
    if ((breads / 2) > cheese)
        return cheese;
    else
        return breads / 2;
}
console.log(totalSandwich1(10, 1));
