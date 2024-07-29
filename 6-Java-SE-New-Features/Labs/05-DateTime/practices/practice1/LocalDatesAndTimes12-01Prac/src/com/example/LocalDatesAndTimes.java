package com.example;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import static java.time.Month.*;  // Months
import static java.time.DayOfWeek.*; // Days of the week
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import static java.time.temporal.ChronoUnit.*;  // DAYS, HOURS, etc
import java.time.temporal.TemporalAdjusters;

public class LocalDatesAndTimes {

  public static void main(String[] args) {
    
    // Abe Lincoln's Birthday: February 12, 1809, died April 15, 1855
    //   How old when he died?
    //   How many days did he live?  
    LocalDate born =LocalDate.of(1809,2,12);
    LocalDate died = LocalDate.of(1855,4,15);
    Period period = Period.between(born,died);
    int yearsLived = period.getYears();
    System.out.println("Abe was " + yearsLived + " when he died.");
    long days = ChronoUnit.DAYS.between(born,died);
      System.out.println("Abe lived for " + days + " days.");

    
    // Bennedict Cumberbatch, July 19, 1976
    //   Born in a leap year?
    //   How many days in the year he was born?
    //   How many decades old is he?
    //   What was the day of the week on his 21st birthday?
    LocalDate benBorn = LocalDate.of(1976,7,19);
      System.out.println("Bennedict was born in leap year: " + benBorn.isLeapYear());
      int numberOfDays = benBorn.isLeapYear() ? 366 : 365;
      System.out.println("Days in the year he was born: "+numberOfDays);
      Period decadePeriod = Period.between(benBorn, LocalDate.now());
      long decades = decadePeriod.getYears()/10;
      System.out.println("Bennedict is " + decades + " decades old.");
      LocalDate birthDate = benBorn.plusYears(21);
      System.out.println("It was "+birthDate.getDayOfWeek()+" on his 21st birthday.");
      
    
    
    // Train departs Boston at 1:45PM and arrives New York 7:25PM
    //   How many minutes long is the train ride?
    //   If the train was delayed 1 hour 19 minutes, what is the actual arrival time?
        LocalTime depart = LocalTime.of(13, 45);
        LocalTime arrive = LocalTime.of(19, 25);
        long minutes = ChronoUnit.MINUTES.between(depart, arrive);
        System.out.println("Planned travel time: "+minutes);
        
        long delayHours = 1;
        long delayMins = 19;
        LocalTime newArrival = arrive.plusHours(delayHours).plusMinutes(delayMins);
        System.out.println("Delayed arrival time: "+newArrival);
     
    
    // Flight: Boston to Miami, leaves March 24th 9:15PM. Flight time is 4 hours 15 minutes
    //   When does it arrive in Miami?
    //   When does it arrive if the flight is delays 4 hours 27 minutes?
      LocalDate departureDate = LocalDate.of(2024, 3, 24);
        LocalTime departureTime = LocalTime.of(21, 15); 
        LocalDateTime departureDateTime = LocalDateTime.of(departureDate, departureTime);

        Duration flightDuration = Duration.ofHours(4).plusMinutes(15);

        LocalDateTime arrivalDateTime = departureDateTime.plus(flightDuration);
        System.out.println("The Flight arrives in Miami: " + arrivalDateTime);

        Duration delayDuration = Duration.ofHours(4).plusMinutes(27);

        LocalDateTime delayedArrivalDateTime = arrivalDateTime.plus(delayDuration);
        System.out.println("The flight Delayed arrival time: " + delayedArrivalDateTime);
    
    // School semester starts the second Tuesday of September of this year.
    //   Hint: Look at the TemporalAdjusters class
    //   What is the date?
    //   School summer vacation starts June 25th
    //   Assuming:
    //     *  Two weeks off in December
    //     *  Two other vacation weeks
    //     *  School is taught Monday - Friday
    //   How many days of school are there?
    //   Hint: keep track of the short weeks also
    
    
    // A meeting is schedule for 1:30 PM next Tuesday. If today is Tuesday, assume it is today.
    //   What is the time of the week's meetings?
   LocalDate today = LocalDate.now();
   LocalDate nextTuesday = today.with(TemporalAdjusters.next(DayOfWeek.TUESDAY));
   LocalTime meetingTime = LocalTime.of(13, 30);
   LocalDate followingTuesday = nextTuesday.plusWeeks(1);
   System.out.println("The Meeting time is: " + followingTuesday + " at " + meetingTime);
  }
  
}
