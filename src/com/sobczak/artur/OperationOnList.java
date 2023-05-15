package com.sobczak.artur;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperationOnList<E> {


    final List<E> employee = new ArrayList<>();


    public void addEmployee(E employe){
            System.out.println("The person has been added to the list!");
            employee.add(employe);
    }

    public void removeElement(int itemInTheList){
        System.out.println("Item " + itemInTheList + " has been removed!");
        employee.remove(itemInTheList);
    }

    public void updateElements(int objectInTheList, int positionInTheList){

//        System.out.println("""
//                        Which data on list do you want to correct:
//                        1: Name
//                        2: Second Name
//                        3: Surname
//                        4: Address
//                        5: Age
//                        6: Pesel
//                        7: Phone
//                        """);

        Scanner scanner = new Scanner(System.in);
        EmployeeData employeeData = new EmployeeData();
        E oldEmployee = employee.get(objectInTheList);
        employeeData = (EmployeeData) oldEmployee;


        if (positionInTheList == 1 || positionInTheList == 2 || positionInTheList == 3 || positionInTheList == 4){
            System.out.println("Please give text data: ");
            String textData = scanner.nextLine();
        switch (positionInTheList) {
            case 1:
                employeeData.setName(textData);
                break;
            case 2:
                employeeData.setSecondName(textData);
                break;
            case 3:
                employeeData.setSurname(textData);
                break;
            case 4:
                employeeData.setAddress(textData);
                break;
                }
        }
        if (positionInTheList == 5 || positionInTheList == 6 || positionInTheList == 7) {
            System.out.println("Please give numeric data: ");
            int numericData = scanner.nextInt();
            switch (positionInTheList) {
                case 5:
                    employeeData.setAge(numericData);
                    break;
                case 6:
                    employeeData.setPesel(numericData);
                    break;
                case 7:
                    employeeData.setPhone(numericData);
                    break;
            }
        }
        // TODO - add exception ArrayIndexOutOfBoundsException

        System.out.println("Element " + objectInTheList + " has been updated!");
        employee.set(objectInTheList, (E) employeeData);
    }

    public void printList(){
        System.out.println("Entire list");

        for (E entireList : employee) {
            System.out.println(entireList);
        }
        System.out.println();
    }




}
