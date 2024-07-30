import Employee  from "./Employee";
class Manager extends Employee {
    constructor(givenEmpNo:number,givenEmpName:string,givenSal:number,private manager:string) {
        super(givenEmpNo,givenEmpName,givenSal);
        console.log(manager);
        
    }

    showDetails(): void {
        let empdetails = super.showDetails;
        console.log(`Employee ${empdetails()} works under the Manager ${this.manager}`)
    }
}

let mangRef1 = new Manager(1,"dkj",324,"ds");
mangRef1.showDetails();
