package com.sobczak.artur;

import java.util.*;

public class Main {

    public static void main(String[] args) throws NieprawidlowyWiekException {

//        EmployedPeople employedPeople = new EmployedPeople();
//        EmployeeData employeeData = new EmployeeData();
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
            if (choiceOperation == 'A' || choiceOperation == 'a') {
                addElements = true;
            } else if (choiceOperation == 'R' || choiceOperation == 'r') {
                removeElements = true;
            } else if (choiceOperation == 'U' || choiceOperation == 'u') {
                updateElements = true;
            } else if (choiceOperation == 'E' || choiceOperation == 'e') {
                endProgram = true;
            } else if (choiceOperation == 'P' || choiceOperation == 'p'){
                printList = true;
            }

            while (addElements) {
                EmployeeData employeeData = new EmployeeData();
                employeeData.setEmployeeData();
                operationOnList.addEmployee(employeeData);
                System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
                choiceOperation = getChar().charAt(0);
                if (choiceOperation == 'Y' || choiceOperation == 'y') {

                } else if (choiceOperation == 'N' || choiceOperation == 'n') {
                    addElements = false;
                }

            }

            while (removeElements) {
                System.out.println("Which position are you want remove?");
                operationOnList.removeElement(getListPosition());
                System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
                choiceOperation = getChar().charAt(0);
                if (choiceOperation == 'Y' || choiceOperation == 'y') {

                } else if (choiceOperation == 'N' || choiceOperation == 'n') {
                    removeElements = false;
                }
            }

            while (updateElements) {
                System.out.println("Please give data employee which have you update: ");
                EmployeeData employeeData = new EmployeeData();
                employeeData.setEmployeeData();
                System.out.println("Which element to be updated: ");
                operationOnList.updateElements(getListPosition(), employeeData);
                System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
                choiceOperation = getChar().charAt(0);
                if (choiceOperation == 'Y' || choiceOperation == 'y') {

                } else if (choiceOperation == 'N' || choiceOperation == 'n') {
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

//    public static String getDataToList() {
//        return new Scanner(System.in).nextLine();
//    }

    public static String getChar() {
        return new Scanner(System.in).nextLine();
    }

    public static int getListPosition() {
        return new Scanner(System.in).nextInt();
    }

}


