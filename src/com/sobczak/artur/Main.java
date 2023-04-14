package com.sobczak.artur;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        EmployedPeople<String> employedPeople = new EmployedPeople<>();

        char choice;
        boolean addElements = false;
        boolean removeElements = false;
        boolean updateElements = false;
        boolean aboutContinue = true;

        System.out.println("What kind of operation on list want to do ?\nAdding elements, delete or update?\nIf you have adding use 'A', remove 'R' or uptade 'U'");
        choice = getChar().charAt(0);
        if (choice == 'A'){
            addElements = true;
        } else if (choice == 'R'){
            removeElements = true;
        } else if (choice == 'U'){
            updateElements = true;
        }

        while (addElements && aboutContinue) {
            employedPeople.addEmployee(getDataToList());
//            System.out.println("Are you have add another data to list?\nIf yes enter 'Y', if no enter 'N'");
//            choice = getChar().charAt(0);
//            if (choice == 'Y'){
//
//            } else if (choice == 'N'){
//                addElements = false;
//            }
        }
        employedPeople.printList();

        while (removeElements && aboutContinue){
            employedPeople.removeElement(getListPosition());
//            System.out.println("Item " + Main.getListPosition() + "has been removed!");
            System.out.println("Are you have remove another data from list?\nIf yes enter 'Y', if no enter 'N'");
        }
        employedPeople.printList();

        while (updateElements && aboutContinue){
            employedPeople.updateElements(getListPosition(), getDataToList());
        }
        employedPeople.printList();


    }
    public static String getDataToList() {
        return new Scanner(System.in).nextLine();
    }
    public static String getChar() {
        return new Scanner(System.in).nextLine();
    }
    public static int getListPosition() {
        return new Scanner(System.in).nextInt();
    }
    public static boolean askAboutContinue(char choice, boolean addElements, boolean removeElements, boolean updateElements){
        boolean aboutContinue;
        System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
        choice = getChar().charAt(0);
        if (choice == 'Y' && addElements == true){

        } else if (choice == 'N' && addElements == true){
            addElements = false;
            aboutContinue = addElements;
        } else if (choice == 'Y' && removeElements == true){

        } else if (choice == 'N' && removeElements == true){
            removeElements = false;
            aboutContinue = removeElements;

        return aboutContinue;
    }
}
