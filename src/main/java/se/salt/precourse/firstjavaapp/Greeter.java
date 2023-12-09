package se.salt.precourse.firstjavaapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Greeter {
  protected static String greet(String namePassedIn) {
    return "Welcome to SALT, " + namePassedIn;
  }

  protected static String days(String datePassedIn) {
    LocalDate strToDate = LocalDate.parse(datePassedIn);
    long daysCount = ChronoUnit.DAYS.between(LocalDate.now(), strToDate);
    return "Today it is " + daysCount + " days left until the course starts";
  }

  public static void main(String[] args) throws IOException {
    System.out.print("What is your name? ");

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = reader.readLine();

    System.out.print("When does that course start? ");
    String date = reader.readLine();

    reader.close();

    String greeting = greet(name);
    String daysOfCourse = days(date);

    System.out.println(greeting);
    System.out.println(daysOfCourse);
  }
}
