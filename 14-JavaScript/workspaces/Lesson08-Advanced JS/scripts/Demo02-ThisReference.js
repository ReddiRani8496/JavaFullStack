console.log(this); // prints the window object

var moiveObjRef = {
    value : 12,
    fun : function() {
        console.log(this.value);
    
    }
}

moiveObjRef.fun();