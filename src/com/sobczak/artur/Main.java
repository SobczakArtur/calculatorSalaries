package com.sobczak.artur;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        EmployedPeople<String> employedPeople = new EmployedPeople<>();
//        Scanner scanner = new Scanner(System.in);
//        String takeChar = scanner.nextLine();

        char choice = 0;
        boolean employeeAccess = true;

        while (employeeAccess) {
            System.out.println("Please enter the person's details.");
            employedPeople.addEmployee(getDataToList());
            System.out.println("Are you have add another data to list?\nIf yes enter 'Y', if no enter 'N'");
            choice = getChar().charAt(0);
            if (choice == 'Y'){
                employeeAccess = true;
            } else if (choice == 'N'){
                employeeAccess = false;
            }
        }
        employedPeople.printList();
    }
    public static String getDataToList() {
        return new Scanner(System.in).nextLine();
    }
    public static String getChar() {
        return new Scanner(System.in).nextLine();
    }
}
