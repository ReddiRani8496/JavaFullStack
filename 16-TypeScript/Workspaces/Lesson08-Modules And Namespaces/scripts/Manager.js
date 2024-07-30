"use strict";
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
Object.defineProperty(exports, "__esModule", { value: true });
var Employee_1 = require("./Employee");
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(givenEmpNo, givenEmpName, givenSal, manager) {
        var _this = _super.call(this, givenEmpNo, givenEmpName, givenSal) || this;
        _this.manager = manager;
        console.log(manager);
        return _this;
    }
    Manager.prototype.showDetails = function () {
        var empdetails = _super.prototype.showDetails;
        console.log("Employee ".concat(empdetails(), " works under the Manager ").concat(this.manager));
    };
    return Manager;
}(Employee_1.default));
var mangRef1 = new Manager(1, "dkj", 324, "ds");
mangRef1.showDetails();
