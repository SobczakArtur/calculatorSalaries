package com.sobczak.artur;

import java.util.ArrayList;
import java.util.List;

public class OperationOnList<E> {


    private List<E> employee = new ArrayList<>();

    public void addEmployee(E employe){
        System.out.println("The person has been added to the list!");
        employee.add(employe);
    }

    public void removeElement(int itemInTheList){
        System.out.println("Item " + itemInTheList + " has been removed!");
        employee.remove(itemInTheList);
    }

    public void updateElements(int itemInTheList, E element){
        System.out.println("Element " + itemInTheList + " has been updated!");
        employee.set(itemInTheList, element);
    }

    public void printList(){
        System.out.println("Entire list");
        for (E entireList : employee) {
            System.out.print(entireList + " ");
        }
        System.out.println();
    }

}
