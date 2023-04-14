package com.sobczak.artur;

import java.util.ArrayList;
import java.util.List;

public class EmployedPeople <E> {

    private List<E> employee = new ArrayList<>();

    public void addEmployee(E employe){
        System.out.println("Please enter the person's details.");
        System.out.println();
        employee.add(employe);
        System.out.println("The person has been added to the list!");
    }

    public void removeElement(int itemInTheList){
        System.out.println("Which position are you want remove?");
        employee.remove(itemInTheList);
        System.out.println("Item " + itemInTheList + "has been removed!");
    }

    public E updateElements(int index, E element){
        System.out.println("Which element to be updated: ");
        System.out.println(employee.get(index));
        System.out.println("Element " + index + "has been updated!");
        return employee.set(index, element);
    }

    public void printList(){
        System.out.println("Entire list");
        for (E entireList : employee) {
            System.out.print(entireList + " ");
        }
        System.out.println();
    }


}
