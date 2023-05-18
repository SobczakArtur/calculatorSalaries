package com.sobczak.artur;

public class EmployedPeople {

    private String name, secondName, surname, address;
    private int age;
    private long pesel, phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Name has added!");
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
        System.out.println("Second name has added!");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
        System.out.println("Surname has added!");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        System.out.println("Addres has added!");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        System.out.println("Age has added!");
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
        System.out.println("Pesel has added!");
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
        System.out.println("Phone has added!");
    }

    @Override
    public String toString() {
        return "EmployedPeople\n" +
                "name= '" + getName() + '\'' +
                ", secondName= '" + getSecondName() + '\'' +
                ", surname= '" + getSurname() + '\'' +
                ", address= '" + getAddress() + '\'' +
                ", age= " + getAge() +
                ", pesel= " + getPesel() +
                ", phone= " + "+48 " + getPhone() + "\n";
    }
}
