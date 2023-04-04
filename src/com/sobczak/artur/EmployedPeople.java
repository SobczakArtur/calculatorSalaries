package com.sobczak.artur;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class EmployedPeople <E> {

    private List<E> Employee = new ArrayList<>();

    public void addEmployee(E employe){
        System.out.println("The person has been added to the list!");
        System.out.println();
        Employee.add(employe);
    }

    public void removeElement(int itemInTheList){
        Employee.remove(itemInTheList);
        System.out.println("Item " + itemInTheList + "has been removed!");
    }

    public void printList(){
        System.out.println("Entire list");
        for (E entireList : Employee) {
            System.out.print(entireList + " ");
        }
        System.out.println();
    }

}
