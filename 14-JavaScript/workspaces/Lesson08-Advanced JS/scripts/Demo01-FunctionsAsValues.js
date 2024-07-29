var sum = function(a,b) {
            return a+b; // 2+3 => 5
          }
  
function invoke(fn) {
    return fn(2,3); // sum(2,3)
}          

console.log(invoke(sum));