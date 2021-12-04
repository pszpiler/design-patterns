package com.szpiler._08_filter;

import com.szpiler._08_filter.filter.*;
import com.szpiler._08_filter.model.MartialStatus;
import com.szpiler._08_filter.model.Person;
import com.szpiler._08_filter.model.Sex;

import java.util.ArrayList;
import java.util.List;

public class Program {
  public static void main(String[] args) {
    List<Person> persons = new ArrayList<>();

    persons.add(new Person("Przemek", Sex.MALE, MartialStatus.SINGLE));
    persons.add(new Person("Asia", Sex.FEMALE, MartialStatus.SINGLE));
    persons.add(new Person("Iza", Sex.FEMALE, MartialStatus.MARRIED));
    persons.add(new Person("Janek", Sex.MALE, MartialStatus.MARRIED));
    persons.add(new Person("Mia", Sex.FEMALE, MartialStatus.SINGLE));
    persons.add(new Person("Emilia", Sex.FEMALE, MartialStatus.MARRIED));
    persons.add(new Person("Karolina", Sex.FEMALE, MartialStatus.SINGLE));
    persons.add(new Person("Kuba", Sex.MALE, MartialStatus.SINGLE));
    persons.add(new Person("Michał", Sex.MALE, MartialStatus.MARRIED));
    show(persons);

    Filter femaleFilter = new FemaleFilter();
    List<Person> females = femaleFilter.filter(persons);
    show(females);

    Filter maleFilter = new MaleFilter();
    List<Person> males = maleFilter.filter(persons);
    show(males);

    Filter singleMartialStatusFilter = new SingleMartialStatusFilter();
    List<Person> singles = singleMartialStatusFilter.filter(persons);
    show(singles);

    Filter marriedMartialStatusFilter = new MarriedMartialStatusFilter();
    List<Person> married = marriedMartialStatusFilter.filter(persons);
    show(married);

    Filter singleFemalesFilter = new AndFilter(femaleFilter, singleMartialStatusFilter);
    List<Person> singleFemales = singleFemalesFilter.filter(persons);
    show(singleFemales);

    Filter singleMalesFilter = new AndFilter(maleFilter, singleMartialStatusFilter);
    List<Person> singleMales = singleMalesFilter.filter(persons);
    show(singleMales);

    Filter marriedMalesFilter = new AndFilter(maleFilter, marriedMartialStatusFilter);
    List<Person> marriedMales = marriedMalesFilter.filter(persons);
    show(marriedMales);

    Filter singleFemalesOrMarriedMalesFilter = new OrFilter(singleFemalesFilter, marriedMalesFilter);
    List<Person> singleFemalesOrMarriedMales = singleFemalesOrMarriedMalesFilter.filter(persons);
    show(singleFemalesOrMarriedMales);
  }

  private static void show(List<Person> persons) {
    System.out.println("--------------------------------------------");
    for (Person person : persons) {
      System.out.println(person.getName() + " " + person.getSex().name() + " " + person.getMartialStatus().name());
    }
  }
}
