var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(empNo, name, salary, bonus) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }
    Employee.prototype.getEmpNo = function () {
        return this.empNo;
    };
    Employee.prototype.getName = function () {
        return this.name;
    };
    Employee.prototype.getSalary = function () {
        return this.salary;
    };
    Employee.prototype.getBonus = function () {
        return this.bonus;
    };
    Employee.prototype.setEmpNo = function (empNo) {
        this.empNo = empNo;
    };
    Employee.prototype.setName = function (name) {
        this.name = name;
    };
    Employee.prototype.setSalary = function (salary) {
        this.salary = salary;
    };
    Employee.prototype.setBonus = function (bonus) {
        this.bonus = bonus;
    };
    Employee.prototype.toString = function () {
        return "Employee Details:\n        EmpNo: ".concat(this.empNo, "\n        Name: ").concat(this.name, "\n        Salary: ").concat(this.salary, "\n        Bonus: ").concat(this.bonus);
    };
    return Employee;
}());
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(empNo, name, salary, bonus, noOfReportees) {
        var _this = _super.call(this, empNo, name, salary, bonus) || this;
        _this.noOfReportees = noOfReportees;
        return _this;
    }
    Manager.prototype.getNoOfReportees = function () {
        return this.noOfReportees;
    };
    Manager.prototype.setNoOfReportees = function (noOfReportees) {
        this.noOfReportees = noOfReportees;
    };
    Manager.prototype.toString = function () {
        return "".concat(_super.prototype.toString.call(this), "\n        NoOfReportees: ").concat(this.noOfReportees);
    };
    return Manager;
}(Employee));
var manager = new Manager(1, 'John', 50000, 5000, 10);
console.log(manager.toString());
