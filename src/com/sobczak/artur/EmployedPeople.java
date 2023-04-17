package com.sobczak.artur;

import java.util.ArrayList;
import java.util.List;

public class EmployedPeople <E> {

    private List<E> employee = new ArrayList<>();

    public void addEmployee(E employe){
        System.out.println();
        System.out.println("The person has been added to the list!");
        employee.add(employe);

    }

    public void removeElement(int itemInTheList){
        System.out.println("Item " + itemInTheList + "has been removed!");
        employee.remove(itemInTheList);
    }

    public void updateElements(int index, E element){
        System.out.println("Element " + index + "has been updated!");
        employee.set(index, element);
    }

    public void printList(){
        System.out.println("Entire list");
        for (E entireList : employee) {
            System.out.print(entireList + " ");
        }
        System.out.println();
    }


}
