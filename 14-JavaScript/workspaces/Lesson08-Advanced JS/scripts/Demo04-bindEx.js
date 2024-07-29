var myObj = {
    x : 12,
    getX : function() {
        return this.x;
    }
};

var unBoundedGetX = myObj.getX;
console.log(unBoundedGetX()); // the scope is within getX

var boundexGetX = unBoundedGetX.bind(myObj);
console.log(boundexGetX());