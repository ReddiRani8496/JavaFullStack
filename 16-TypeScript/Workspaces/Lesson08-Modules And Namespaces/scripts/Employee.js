"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Employee = /** @class */ (function () {
    function Employee(empNo, empName, empSal) {
        this.empNo = empNo;
        this.empName = empName;
        this.empSal = empSal;
        // arguments declared within the constructor arguments are auto initalized
        console.log("Constructor called");
        console.log(empNo);
        this.bonus = empSal * 0.25;
    }
    Employee.prototype.getBonus = function () {
        return this.bonus;
    };
    Employee.prototype.setBonus = function (bonus) {
        this.bonus = bonus;
    };
    Employee.prototype.showDetails = function () {
        console.log("Employee Details [ EmpNo: ".concat(this.empNo, ",\n                                        EmpName: ").concat(this.empName, ",\n                                        EmpSalary: ").concat(this.empSal, ",\n                                        EmpBonus: ").concat(this.bonus));
    };
    return Employee;
}());
exports.default = Employee;
