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
                    setAge(getAgeValue()); // TODO - addition throws exception about long age
                    accessAgeNumber = false;
                } catch (InputMismatchException | NieprawidlowyWiekException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value or value age under 65");
                }
            }
            while (accessPeselNumber) {
                try {
                    System.out.println("Give pesel:");
                    setPesel(getPeselValue()); // TODO - addition throws exception about long PESEL
                    accessPeselNumber = false;
                }catch (InputMismatchException | NieprawidlowyWiekException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value or PESEL equals to 11 positions");
                }
            }
            while (accessPhoneNumber) {
                try {
                    System.out.println("Give phone number:");
                    setPhone(getPhoneValue()); // TODO - addition throws exception about long phone number
                    accessPhoneNumber = false;
                }catch (InputMismatchException | NieprawidlowyWiekException e) {
                    System.out.println("Invalid data" + "\nPlease enter a numerical value or phone number equals to 12 positions");
                }
            }

            set = false;

        }
    }

    public static String getDataToList() {
        return new Scanner(System.in).nextLine();
    }

    public static long getAgeValue() throws NieprawidlowyWiekException {
        long l = new Scanner(System.in).nextLong();
        if (l > 65){
            throw new NieprawidlowyWiekException("Za duży wiek!");
        }
        return l;
    }
    public static long getPeselValue() throws NieprawidlowyWiekException {
        long l = new Scanner(System.in).nextLong();
        if (l > 99999999999L){
            throw new NieprawidlowyWiekException("Za duży wiek!");
        }
        return l;
    }
    public static long getPhoneValue() throws NieprawidlowyWiekException {
        long l = new Scanner(System.in).nextLong();
        if (l > 999999999999L){
            throw new NieprawidlowyWiekException("Za duży wiek!");
        }
        return l;
    }
}