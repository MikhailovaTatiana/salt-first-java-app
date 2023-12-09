package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Greeter {
  protected static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn + "!";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    String greeting = greet(name);
    System.out.println(greeting);

    System.out.print("When does your course start (yyyy-mm-dd)? ");
    String startDateInput = reader.readLine();
    reader.close();
    System.out.println("Start date: " + startDateInput);

    StartDateHandler startDateHandler = new StartDateHandler();
    if(startDateHandler.dateHasOnlyNumbers(startDateInput) ){
      System.out.println(" You start in " + startDateHandler.daysToCourseStart(startDateInput) + " days. Better get cracking on that Pre-course!");
    } else {
      System.out.println("Please provide a valid date next time!");
    }
  }
}
