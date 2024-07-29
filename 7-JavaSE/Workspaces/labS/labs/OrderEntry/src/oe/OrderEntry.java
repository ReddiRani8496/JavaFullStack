package oe;

public class OrderEntry {
	public static void main(String[] args) {
		//System.out.println("Order Entry Application");
		
		//double item1;
		//double item2;
		//item1 = 2.95;
		//item2 = 3.50;
		
		float item1 = 2.95f, item2 = 3.50f;
		
		//System.out.println(item1);
		//System.out.println(item2);
		
		System.out.println("Item costs: " + item1);
		System.out.println("Item costs: " + item2);
		
		double itemTotal;
		int line = 1, numberOfDays = 2;
		
		itemTotal = ((item1 * numberOfDays) + (item2 * numberOfDays));
		
		System.out.println("Total cost: " + itemTotal);
		
		
		
		System.out.println("Item " + line++ + " is "+ item1 + " * "+numberOfDays + " days = " + (item1 * numberOfDays));
		
		System.out.println("Item " + line++ +  "is "+ item2 + " * "+numberOfDays + " days = " + (item2 * numberOfDays));
		

		int day = 25, month = 5, year = 2000;
		System.out.println(day + "/" + month + "/" + year);
		
		int daysInMonth;
	/*	switch(month) {
			case 4:
			case 6:
			case 9:
			case 11 : daysInMonth = 30;
					 break;
			case 2 : daysInMonth = 20;
					 break;
			
			default : daysInMonth = 31;
					 break;
		}
		System.out.println(daysInMonth + " days in month");
		*/
		
		System.out.println("Printing all days to end of the month: ");
	//	for(int days = day; days <= daysInMonth; days++) {
	//		System.out.println(days + "/" + month + "/" + year);
	//	}
	
	
	
	/*	day = 1;
		
		for(int days = day, iteration = 0; days <= daysInMonth && iteration<10; days++, iteration++) {
			System.out.println(days + "/" + month + "/" + year);
		}
		*/
		
		
		
		day = 25;
		year = 2001;
		month = 12;
		boolean isLeapYear = (year %4 ==0) && (year%100!=0 || year%400==0);
		
		//Determine valid methods
		if(month > 0 && month < 13 )
			System.out.println(month + " is a valid month");
		else
			System.out.println(month + " is not a valid month");
		
		switch(month) {
			case 4:
			case 6:
			case 9:
			case 11 : daysInMonth = 30;
					 break;
			case 2 : daysInMonth = (isLeapYear) ? 29 : 28;
					 break;
			
			default : daysInMonth = 31;
					 break;
		}
		
		System.out.println(daysInMonth + " days in month");
				
		
		
		int dueDay, dueMonth, dueYear;
		int rentDays = 3;
		 dueDay = day + rentDays;
		dueMonth = month;
		dueYear = year;

		
		System.out.println("Rental Date: " + day + "/" + month + "/" + year);
		System.out.println("Number of rental days: " + rentDays);
		
		// is due day valid for the current month
		if(dueDay <= daysInMonth) {
			System.out.println("Day due back: " + dueDay + "/" + dueMonth + "/" + dueYear);
		} else {
			dueDay = dueDay - daysInMonth;
			dueMonth += 1;
			
			if(dueMonth > 12 ) {
				dueMonth = 1;
				dueYear += 1;
			}
			
			System.out.println("Day due back: " + dueDay + "/" + dueMonth + "/" + dueYear);
		} 
		
		
		System.out.println("Printing all days to end of the month using while loop.... ");
		int temp = day;
		while(temp <= daysInMonth) {
			System.out.println(temp + "/" + month + "/" + year);
			temp++;
		}
		
		System.out.println("Printing maximum of 10 days using while loop.... ");
		int temp1 = 10;
		int daysCount = 0;
		
		while(temp1 <= daysInMonth) {
			System.out.println(temp1 + "/" + month + "/" + year);
			temp1++;
			//daysCount++;
			
			if(++daysCount == 10) {
				break;
			}	
			
		}
	}
}