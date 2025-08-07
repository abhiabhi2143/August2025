package Lab1;

import java.time.LocalDate;
import java.time.Period;

public class Lab1_15 {
    String firstName;
    String lastName;
    LocalDate dob;

    public Lab1_15(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public int calculateAge(LocalDate dob) {
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public void displayDetails() {
        String fullName = getFullName(firstName, lastName);
        int age = calculateAge(dob);
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age + " years");
    }

    public static void main(String[] args) {
        String firstName = "Abhiram";
        String lastName = "Kondeti";
        LocalDate dob = LocalDate.of(2002, 11, 19);

        Lab1_15 person = new Lab1_15(firstName, lastName, dob);
        System.out.println("Person Details -");
        person.displayDetails();
    }
}
