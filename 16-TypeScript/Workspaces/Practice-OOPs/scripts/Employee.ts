class Employee {
    private empNo: number;
    private name: string;
    private salary: number;
    private bonus: number;

    constructor(empNo: number, name: string, salary: number, bonus: number) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    getEmpNo(): number {
        return this.empNo;
    }

    getName(): string {
        return this.name;
    }

    getSalary(): number {
        return this.salary;
    }

    getBonus(): number {
        return this.bonus;
    }

    setEmpNo(empNo: number): void {
        this.empNo = empNo;
    }

    setName(name: string): void {
        this.name = name;
    }

    setSalary(salary: number): void {
        this.salary = salary;
    }

    setBonus(bonus: number): void {
        this.bonus = bonus;
    }

 
    toString(): string {
        return `Employee Details:
        EmpNo: ${this.empNo}
        Name: ${this.name}
        Salary: ${this.salary}
        Bonus: ${this.bonus}`;
    }
}

class Manager extends Employee {
    private noOfReportees: number;

    constructor(empNo: number, name: string, salary: number, bonus: number, noOfReportees: number) {
        super(empNo, name, salary, bonus);
        this.noOfReportees = noOfReportees;
    }

   
    getNoOfReportees(): number {
        return this.noOfReportees;
    }

    setNoOfReportees(noOfReportees: number): void {
        this.noOfReportees = noOfReportees;
    }


    toString(): string {
        return `${super.toString()}
        NoOfReportees: ${this.noOfReportees}`;
    }
}


const manager = new Manager(1, 'John', 50000, 5000, 10);
console.log(manager.toString());
