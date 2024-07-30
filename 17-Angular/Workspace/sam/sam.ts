interface calcy{
    mul(n:number);
}
class display implements calcy{
    x:number;
    mul(n:number){
        this.x=n*n;
    }
        mul(n:string){this.x=n+n;}}let arr=new display;arr.x=0;arr.mul(2);