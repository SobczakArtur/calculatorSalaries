package com.sobczak.artur;

import java.util.Scanner;

public class EmployeeData extends EmployedPeople {

    boolean set = true;
    char choiceOperation;

    public void setEmployeeData() {

        while (set) {
            System.out.println("Please enter the person's details like: name,\n secondName,\n surname,\n address,\n age,\n pesel,\n phone");
            setName(getDataToList());
            setSecondName(getDataToList());
            setSurname(getDataToList());
            setAddress(getDataToList());
            setAge(getNumberValue());
            setPesel(getNumberValue());
            setPhone(getNumberValue());


            System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
            choiceOperation = getChar().charAt(0);
            if (choiceOperation == 'Y') {

            } else if (choiceOperation == 'y') {

            } else if (choiceOperation == 'N') {
                set = false;
            } else if (choiceOperation == 'n') {
                set = false;
            }
        }
    }

    public static String getDataToList() {
        return new Scanner(System.in).nextLine();
    }

    public static int getNumberValue() {
        return new Scanner(System.in).nextInt();
    }

    public static String getChar() {
        return new Scanner(System.in).nextLine();
    }
}