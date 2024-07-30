function totalSandwich(breads:number):number {
    return Math.floor(breads/2);
}

console.log(totalSandwich(10));


function totalSandwich1(breads:number, cheese:number):number {
    if((breads/2)>cheese)
        return cheese;
    else
        return breads/2;
}

console.log(totalSandwich1(10,1));
