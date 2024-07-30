class RentalReturnCalculator {
    private static daysInMonth(month: number, year: number): number {
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
    }

    private static isLeapYear(year: number): boolean {
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
    }

    public static calculateReturnDate(rentDate: Date, rentalDays: number): Date {
        let day: number = rentDate.getDate();
        let month: number = rentDate.getMonth() + 1;
        let year: number = rentDate.getFullYear();

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
    }
}

const rentDate = new Date(2024, 5, 4);
const rentalDays = 30;

const returnDate = RentalReturnCalculator.calculateReturnDate(rentDate, rentalDays);
console.log(`Return Date: ${returnDate.toDateString()}`);
