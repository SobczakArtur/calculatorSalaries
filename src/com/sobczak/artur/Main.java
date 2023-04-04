package com.sobczak.artur;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        EmployedPeople<String> employedPeople = new EmployedPeople<>();
//        Scanner scanner = new Scanner(System.in);
//        String takeChar = scanner.nextLine();

        char choice = 0;
        boolean addElements = true;
        boolean removeElements = true;

        System.out.println("What kind of operation on list want to do ?\nAdding elements, delete or update?\nIf you have adding use 'A', remove 'R' or uptade 'U'");
        choice = getChar().charAt(0);
        if (choice == '+'){
            addElements = true;
        } else if (choice == '-'){
            removeElements = true;
        }

        while (addElements) {
            System.out.println("Please enter the person's details.");
            employedPeople.addEmployee(getDataToList());
            System.out.println("Are you have add another data to list?\nIf yes enter 'Y', if no enter 'N'");
            choice = getChar().charAt(0);
            if (choice == 'Y'){

            } else if (choice == 'N'){
                addElements = false;
            }
        }
        employedPeople.printList();

        while (removeElements){
            employedPeople.removeElement(geListPosition());
        }




    }
    public static String getDataToList() {
        return new Scanner(System.in).nextLine();
    }
    public static String getChar() {
        return new Scanner(System.in).nextLine();
    }
    public static int geListPosition() {
        return new Scanner(System.in).nextInt();
    }
}
