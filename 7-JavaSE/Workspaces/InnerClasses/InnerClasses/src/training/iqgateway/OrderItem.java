package oe;

import java.text.SimpleDateFormat;

import java.time.*;
import java.util.Scanner;



public class OrderItem
{
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter the rental date: ");
        String rentalDate = sc.nextLine();

        System.out.print("Enter the total number of rental days: ");
        int rentalDays = sc.nextInt();
      System.out.println("The return date is: " + returnDate(rentalDate,rentalDays));
      
      LocalDate startDate = LocalDate.parse(rentalDate);
        int month = startDate.getMonthValue();
    int year = startDate.getYear();
    int days = totalDays(month, year);
    System.out.println("Total days in  a month: "+days);
    
    System.out.println("Year is leap or not: " + isLeapYear(year));
  }
  
  public static LocalDate returnDate(String rentalDate, int rentalDays) {
      LocalDate startDate = LocalDate.parse(rentalDate);
              LocalDate returnDate = startDate.plusDays(rentalDays);
              SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
              try {
                  return sdf.parse(returnDate.toString());
              } catch (Exception e) {
                  e.printStackTrace();
                  return null;
              }
  }

    public static boolean isLeapYear(int year)
    {
      return (year % 4 == 0) &&
             ((year% 100 != 0) || (year % 400 == 0));
    }

    public static int totalDays(int month, int year)
    {
      int daysInMonth = 0;

      switch (month)
      {
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
          daysInMonth = 31;
          break;
        case 2:
          daysInMonth = isLeapYear(year) ? 29 : 28;
          break;
        case 4:
        case 6:
        case 9:
        case 11:
          daysInMonth = 30;
          break;
      default:
          System.out.print("No month is selected");
          break;
      }
      return daysInMonth;
    }

}