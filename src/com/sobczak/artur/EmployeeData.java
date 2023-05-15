package com.sobczak.artur;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeData extends EmployedPeople {

    boolean set = true;

    public void setEmployeeData() {

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
            System.out.println("Give name:");
            setName(getDataToList());
            System.out.println("Give second name:");
            setSecondName(getDataToList());
            System.out.println("Give surname:");
            setSurname(getDataToList());
            System.out.println("Give address:");
            setAddress(getDataToList());
            while (accessAgeNumber) {
                try {
                    System.out.println("Give age:");
                    setAge(getAgeValue());
                    accessAgeNumber = false;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid data!" + "\nPlease enter a numerical value!");
                } catch (NieprawidlowyWiekException e) {
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
                } catch (NieprawidlowyWiekException e) { // TODO - correct exception
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
                } catch (NieprawidlowyWiekException e) { // TODO - correct exception
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

    public static String getDataToList() {

        return new Scanner(System.in).nextLine();
    }

    public static long getAgeValue() throws NieprawidlowyWiekException {
        long l = new Scanner(System.in).nextLong();
        if (l > 65){
            throw new NieprawidlowyWiekException("Age must be under 65");
        }
        return l;
    }
    public static long getPeselValue() throws NieprawidlowyWiekException {
        long l = new Scanner(System.in).nextLong();
        if (l == 99999999999L){
            throw new NieprawidlowyWiekException("PESEL must be equals to 11 positions");
        }
        return l;
    }
    public static long getPhoneValue() throws NieprawidlowyWiekException {
        long l = new Scanner(System.in).nextLong();
        if (l == 999999999999L){
            throw new NieprawidlowyWiekException("Phone number must be equals to 12 positions");
        }
        return l;
    }
}