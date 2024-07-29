function doAdd(...args) {
    let sum =  0;
    for(let i of args) 
        sum += i;
    
    console.log(sum);
}

doAdd(1,2,3,4,5);