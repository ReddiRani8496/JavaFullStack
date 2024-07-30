var RentalReturnCalculator = /** @class */ (function () {
    function RentalReturnCalculator() {
    }
    RentalReturnCalculator.daysInMonth = function (month, year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return this.isLeapYear(year) ? 29 : 28;
            default:
                throw new Error("Invalid month");
        }
    };
    RentalReturnCalculator.isLeapYear = function (year) {
        if (year % 4 === 0) {
            if (year % 100 === 0) {
                if (year % 400 === 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    };
    RentalReturnCalculator.calculateReturnDate = function (rentDate, rentalDays) {
        var day = rentDate.getDate();
        var month = rentDate.getMonth() + 1;
        var year = rentDate.getFullYear();
        day += rentalDays;
        while (day > this.daysInMonth(month, year)) {
            day -= this.daysInMonth(month, year);
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return new Date(year, month - 1, day);
    };
    return RentalReturnCalculator;
}());
var rentDate = new Date(2024, 5, 4);
var rentalDays = 30;
var returnDate = RentalReturnCalculator.calculateReturnDate(rentDate, rentalDays);
console.log("Return Date: ".concat(returnDate.toDateString()));
