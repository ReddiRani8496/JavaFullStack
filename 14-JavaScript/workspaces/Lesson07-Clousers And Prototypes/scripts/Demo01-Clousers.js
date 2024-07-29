function add(number1, number2) {
    function doAdd() {
        console.log(num);
        return number1 + number2;
    }
    let num = 10;
    return doAdd();
}

let res = add(10,20);
console.log(res);