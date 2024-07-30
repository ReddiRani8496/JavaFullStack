class Employee {
    private bonus:number;

    public getBonus(): number {
        return this.bonus;
    }

    public setBonus(bonus: number): void {
        this.bonus = bonus;
    }

    
    constructor(private empNo:number, private empName:string, private empSal:number) {
        // arguments declared within the constructor arguments are auto initalized
        this.bonus = empSal*0.25;
    }

    
      showDetails() {
        console.log(`Employee Details [ EmpNo: ${this.empNo},
                                        EmpName: ${this.empName},
                                        EmpSalary: ${this.empSal},
                                        EmpBonus: ${this.bonus}`);
        
    }
    
}

var emp1Ref = new Employee(1,"John",60000);
emp1Ref.showDetails();

