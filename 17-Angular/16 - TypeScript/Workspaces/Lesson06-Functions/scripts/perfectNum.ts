function isPerfectNumber(num:number) {
    let sum = 0;
    
    for(let i=1;i<num;i++) {
        if(num%i==0) { 
            sum+=i;
        }
    }

    if((sum===num) && (Math.floor((sum+num)/2)===num)) {
        console.log("Perfect Number");
    }  else {
        console.log("Not a perfect number");
        
    }
}

isPerfectNumber(29);