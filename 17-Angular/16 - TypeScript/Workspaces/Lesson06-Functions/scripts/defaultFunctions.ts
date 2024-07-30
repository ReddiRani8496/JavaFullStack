function defaultParam(num1,num2=100) {
    console.log(`num1: ${num1}, num2:${num2}`);
}

defaultParam(10);

function add(n1,n2):number {
    return n1+n2;
}

function addTwoNums(a,b,sum) {
    console.log(sum(a,b));
}

addTwoNums(10,20,add);

function stringConcat(str:any,num3:any) {
    console.log(str+num3);
}

stringConcat("Age is ",20);