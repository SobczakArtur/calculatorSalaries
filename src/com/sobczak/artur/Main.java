package com.sobczak.artur;

import java.util.*;

public class Main {

    public static boolean continueAdd(char choiceOperation, boolean addElements) {
        System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
        choiceOperation = getChar().charAt(0);
        if (choiceOperation == 'Y') {

        } else if (choiceOperation == 'N') {
                addElements = false;

        }
        return addElements;
    }

    public static boolean continueRemove(char choiceOperation, boolean removeElements) {
        System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
        choiceOperation = getChar().charAt(0);
        if (choiceOperation == 'Y') {

        } else if (choiceOperation == 'N') {
                removeElements = false;
        }
        return removeElements;
    }

    public static boolean continueUpdate(char choiceOperation, boolean updateElements) {
        System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
        choiceOperation = getChar().charAt(0);
        if (choiceOperation == 'Y') {

        } else if (choiceOperation == 'N') {
                updateElements = false;
        }
        return updateElements;
    }

    public static void main(String[] args) {


        EmployedPeople<String> employedPeople = new EmployedPeople<>();

        char choiceOperation;
        boolean addElements = false;
        boolean removeElements = false;
        boolean updateElements = false;

        System.out.println("What kind of operation on list want to do ?\nAdding elements, delete or update?\nIf you have adding use 'A', remove 'R' or uptade 'U'");
        choiceOperation = getChar().charAt(0);
        if (choiceOperation == 'A') {
            addElements = true;
        } else if (choiceOperation == 'R') {
            removeElements = true;
        } else if (choiceOperation == 'U') {
            updateElements = true;
        }

        while (addElements) {
            System.out.println("Please enter the person's details.");
            employedPeople.addEmployee(getDataToList());
            Main.continueAdd(choiceOperation, addElements);
//            bonus.continueAdd(choiceOperation, addElements);
//            System.out.println("Are you have add another data to list?\nIf yes enter 'Y', if no enter 'N'");
//            choice = getChar().charAt(0);
//            if (choice == 'Y'){
//
//            } else if (choice == 'N'){
//                addElements = false;
//            }
        }
        employedPeople.printList();

        while (removeElements) {
            System.out.println("Which position are you want remove?");
            employedPeople.removeElement(getListPosition());
//            System.out.println("Item " + Main.getListPosition() + "has been removed!");
        }
        employedPeople.printList();

        while (updateElements) {
            System.out.println("Which element to be updated: ");
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

}


