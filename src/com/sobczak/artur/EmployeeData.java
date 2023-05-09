package com.sobczak.artur;

import java.util.Scanner;

public class EmployeeData extends EmployedPeople {

    boolean set = true;

    public void setEmployeeData() {

        set = true;
        while (set) {
            System.out.println("Please enter the person's details like:\n name,\n second name,\n surname,\n address,\n age,\n pesel,\n phone number\n" +
                    "Give name:");
            setName(getDataToList());
            System.out.println("Give second name:");
            setSecondName(getDataToList());
            System.out.println("Give surname:");
            setSurname(getDataToList());
            System.out.println("Give address:");
            setAddress(getDataToList());
            System.out.println("Give age:");
            setAge(getNumberValue()); // TODO add exception
            System.out.println("Give pesel:");
            setPesel(getNumberValue()); // TODO add exception
            System.out.println("Give phone number:");
            setPhone(getNumberValue()); // TODO add exception

            set = false;

//            System.out.println("Are you have continue?\nIf yes enter 'Y', if no enter 'N'");
//            choiceOperation = getChar().charAt(0);
//            if (choiceOperation == 'Y' || choiceOperation == 'y') {
//
//            } else if (choiceOperation == 'N' || choiceOperation == 'n') {
//                set = false;
//            }
        }
    }

    public static String getDataToList() {
        return new Scanner(System.in).nextLine();
    }

    public static long getNumberValue() {
        return new Scanner(System.in).nextLong();
    }

//    public static String getChar() {
//        return new Scanner(System.in).nextLine();
//    }
}