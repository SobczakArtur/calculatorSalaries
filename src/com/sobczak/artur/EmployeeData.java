package com.sobczak.artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeData extends EmployedPeople {

    boolean set = true;

    public void setEmployeeData() {

        boolean accessName = true;
        boolean accessSecondName = true;
        boolean accessSurname = true;
        boolean accessAddress = true;
        boolean accessAgeNumber = true;
        boolean accessPeselNumber = true;
        boolean accessPhoneNumber = true;
        set = true;
        while (set) {
            System.out.println("""
                    Please enter the person's details like:
                     name,
                     second name,
                     surname,
                     address,
                     age,
                     pesel,
                     phone number""");
            System.out.println();
            while (accessName) {
                try {
                    System.out.println("Give name:");
                    setName(getDataToList());
                    accessName = false;
                } catch (IncorrectTextDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }
            while (accessSecondName) {
                try {
                    System.out.println("Give second name:");
                    setSecondName(getDataToList());
                    accessSecondName = false;
                } catch (IncorrectTextDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }
            while (accessSurname) {
                try {
                    System.out.println("Give surname:");
                    setSurname(getDataToList());
                    accessSurname = false;
                } catch (IncorrectTextDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }
            while (accessAddress) {
                try {
                    System.out.println("Give address:");
                    setAddress(getDataToList());
                    accessAddress = false;
                } catch (IncorrectTextDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }
            while (accessAgeNumber) {
                try {
                    System.out.println("Give age:");
                    setAge(getAgeValue());
                    accessAgeNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data!" + "\nPlease enter a numerical value!");
                } catch (IncorrectNumericalDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }
            while (accessPeselNumber) {
                try {
                    System.out.println("Give pesel:");
                    setPesel(getPeselValue());
                    accessPeselNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data!" + "\nPlease enter a numerical value!");
                } catch (IncorrectNumericalDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }
            while (accessPhoneNumber) {
                try {
                    System.out.println("Give phone number:");
                    setPhone(getPhoneValue());
                    accessPhoneNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data!" + "\nPlease enter a numerical value!");
                } catch (IncorrectNumericalDataException e) {
                    System.out.println("Invalid data! " + e.getMessage());
                }
            }

            set = false;

        }
    }

//    public void setEmployeeDataToUpdate (EmployedPeople employedPeople){
//        setName(employedPeople);
//
//    }

    public static String getDataToList () throws IncorrectTextDataException {

        String s = new Scanner(System.in).nextLine();
        if (s.isEmpty()){
            throw new IncorrectTextDataException("Text data cannot be empty!\nPlease enter text:");
        }
        return s;
    }

    public static int getAgeValue() throws IncorrectNumericalDataException {
        int i = new Scanner(System.in).nextInt();
        if (!(i >= 18 && i < 65)){
            throw new IncorrectNumericalDataException("Age must be equal to or greater than 18 and under 65");
        }
        return i;
    }
    public static long getPeselValue() throws IncorrectNumericalDataException {
        long l = new Scanner(System.in).nextLong();
        if (!(l > 10000000000L && l < 99999999999L)){
            throw new IncorrectNumericalDataException("PESEL must be equals to 11 positions");
        }
        return l;
    }
    public static long getPhoneValue() throws IncorrectNumericalDataException {
        long l = new Scanner(System.in).nextLong();
        if (!(l > 100000000L && l < 999999999L)){
            throw new IncorrectNumericalDataException("Phone number must be equals to 9 positions");
        }
        return l;
    }
}