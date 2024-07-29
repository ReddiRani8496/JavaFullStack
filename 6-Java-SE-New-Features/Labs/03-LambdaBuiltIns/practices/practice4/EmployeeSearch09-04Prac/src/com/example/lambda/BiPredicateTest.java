package com.example.lambda;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

/**
 *
 * @author oracle
 */
public class BiPredicateTest {
  
  public static void main(String[] args) {
    
    List<Employee> eList = Employee.createShortList();
    Employee first = eList.get(0);
    String searchState = "KS";
    
    BiPredicate<Employee, String> eBiPred = (t,s) -> t.getState().equals(s); // Wrtie your BiPredicate here
      
    System.out.println("=== Print matching list");
    for(Employee e:eList){
      if (eBiPred.test(e, searchState)){// Use BiPredicate for test
        e.printSummary();
      }
    }
    
      System.out.println("CO Bonuses");
      eList.stream().filter(e->e.getRole().equals(Role.EXECUTIVE))
              .filter(e->e.getState().equals("CO"))
              .peek(e->System.out.print("Name: "+e.getGivenName()+" "+e.getSurName()))
              .map(e-> e.getSalary() * Bonus.byRole(e.getRole()))
              .forEach(e->System.out.printf("Bonus paid: $%, 6.2f %n",e));
//    Optional<Employee> list;
//    list = eList.stream().filter(e->e.getRole().equals(Role.EXECUTIVE))
//            .filter(e->e.getState().equals("CO"))
//            .findFirst();
//            
//    if(list.isPresent())
//        list.get().print();
  }
}
