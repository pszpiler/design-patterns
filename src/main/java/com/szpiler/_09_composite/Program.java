package com.szpiler._09_composite;

import com.szpiler._09_composite.model.Employee;
import com.szpiler._09_composite.model.Item;
import com.szpiler._09_composite.validator.ItemValidator;
import com.szpiler._09_composite.validator.MaxLengthValidator;
import com.szpiler._09_composite.validator.MinLengthValidator;
import com.szpiler._09_composite.validator.Validator;

public class Program {
  public static void main(String[] args) {
    Validator itemValidator = new ItemValidator();

    Validator minLengthValidator = new MinLengthValidator(5);
    Validator maxLengthValidator = new MaxLengthValidator(50);

    itemValidator.add(minLengthValidator);
    itemValidator.add(maxLengthValidator);

    Item item = new Item("tes", 100);

    try {
      itemValidator.validate(item);
    } catch (RuntimeException e) {
      System.out.println("Validation error: " + e.getMessage());
    }

    System.out.println("---------------------------------");

    Employee ceo = new Employee("Janek", "ceo", 5000);

    Employee headOfSales = new Employee("Kate", "head of sales", 3000);
    Employee headOfIt = new Employee("Jacob", "head of IT", 4000);

    ceo.add(headOfSales);
    ceo.add(headOfIt);

    Employee salesman = new Employee("Jamie", "salesman", 1000);
    headOfSales.add(salesman);

    Employee programmer = new Employee("Ola", "programmer", 2500);
    Employee qa = new Employee("Ann", "qa", 2000);
    headOfIt.add(programmer);
    headOfIt.add(qa);

    System.out.println(ceo);
    System.out.println("-------------------------");

    for (Employee e1 : ceo.getSubordinates()) {
      System.out.println(e1);
      for (Employee e2 : e1.getSubordinates()) {
        System.out.println(e2);
      }
      System.out.println("-------------------------");
    }
  }
}
