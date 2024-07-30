var Employee = /** @class */ (function () {
    function Employee(empNo, empName, empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
        // arguments declared within the constructor arguments are auto initalized
        this.bonus = empSal * 0.25;
    }
    Employee.prototype.showDetails = function () {
        console.log("Employee Details [ EmpNo: ".concat(this.empNo, ",\n                                        EmpName: ").concat(this.empName, ",\n                                        EmpSalary: ").concat(this.empSal, ",\n                                        EmpBonus: ").concat(this.bonus));
    };
    return Employee;
}());
var emp1Ref = new Employee(1, "John", 60000);
emp1Ref.showDetails();
