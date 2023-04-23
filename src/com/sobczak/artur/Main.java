package com.sobczak.artur;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        EmployedPeople employedPeople = new EmployedPeople();
        OperationOnList<EmployedPeople> operationOnList = new OperationOnList<>();

        char choiceOperation;
        boolean addElements = false;
        boolean removeElements = false;
        boolean updateElements = false;
        boolean accessToProgram = true;
        boolean endProgram = false;
        boolean printList = false;

        while (accessToProgram) {
            System.out.println("What kind of operation on list want to do ?" +
                    "\nIf you have adding elements use 'A' or 'a', remove 'R' or 'r', update 'U' or 'u', print list 'P' or 'p' or end 'E' or 'e'");
            choiceOperation = getChar().charAt(0);
            if (choiceOperation == 'A') {
                addElements = true;
            } else if (choiceOperation == 'a') {
                addElements = true;
            } else if (choiceOperation == 'R') {
                removeElements = true;
            } else if (choiceOperation == 'r') {
                removeElements = true;
            } else if (choiceOperation == 'U') {
                updateElements = true;
            } else if (choiceOperation == 'u') {
                updateElements = true;
            } else if (choiceOperation == 'E') {
                endProgram = true;
            } else if (choiceOperation == 'e') {
                endProgram = true;
            } else if (choiceOperation == 'P'){
                printList = true;
            } else if (choiceOperation == 'p'){
                printList = true;
            }

            while (addElements) {
                System.out.println("Please enter the person's details.");
                operationOnList.addEmployee(employedPeople);
                System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
                choiceOperation = getChar().charAt(0);
                if (choiceOperation == 'Y') {

                } else if (choiceOperation == 'y') {

                } else if (choiceOperation == 'N') {
                    addElements = false;
                } else if (choiceOperation == 'n') {
                    addElements = false;
                }
            }

            while (removeElements) {
                System.out.println("Which position are you want remove?");
                operationOnList.removeElement(getListPosition());
                System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
                choiceOperation = getChar().charAt(0);
                if (choiceOperation == 'Y') {

                } else if (choiceOperation == 'y') {

                } else if (choiceOperation == 'N') {
                    removeElements = false;
                } else if (choiceOperation == 'n') {
                    removeElements = false;
                }
            }

            while (updateElements) {
                System.out.println("Which element to be updated: ");
                operationOnList.updateElements(getListPosition(), employedPeople);
                System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
                choiceOperation = getChar().charAt(0);
                if (choiceOperation == 'Y') {

                } else if (choiceOperation == 'y') {

                } else if (choiceOperation == 'N') {
                    updateElements = false;
                } else if (choiceOperation == 'n') {
                    updateElements = false;
                }
            }

            while (printList){
                operationOnList.printList();
                printList = false;
            }

            while (endProgram){
                System.out.println("The program has been ended!");
                endProgram = false;
                accessToProgram = false;
            }



        }
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


