let a:number = 10;
let b:number = 5;
let c:number = 7;

let max1:number=0;
let max2:number=0;
let max3:number=0;

if(a>b && a>c) {
    max1 = a;
} else if(b>a && b>c) {
    max1 = b;
} else if(c>a && c>b) {
    max1 = c;
}

if((a>b && a<c) || (a>c && a<b)) {
    max2=a;
} else if((b>a && b<c) || (b>c && b<a)) {
    max2 = b;
} else if((c>a && c<b) || (c>b && c<a)) {
    max2 = c;
} 


if(c<a && c<b) {
    max3 = c;
} else if(a<b && a<c) {
    max3=a;
} else {
    max3 = b;
}

alert(max1+" " + max2+" " + max3);
