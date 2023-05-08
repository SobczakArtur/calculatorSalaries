package com.sobczak.artur;

public class EmployedPeople {

    private String name, secondName, surname, address;
    private long age, pesel, phone;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        // TODO add exception
        this.name = name;
        System.out.println("Name has added!");
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        // TODO add exception
        this.secondName = secondName;
        System.out.println("Second name has added!");
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        // TODO add exception
        this.surname = surname;
        System.out.println("Surname has added!");
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        // TODO add exception
        this.address = address;
        System.out.println("Addres has added!");
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        // TODO add exception
        this.age = age;
        System.out.println("Age has added!");
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        // TODO add exception
        this.pesel = pesel;
        System.out.println("Pesel has added!");
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        // TODO add exception
        this.phone = phone;
        System.out.println("Phone has added!");
    }


}
