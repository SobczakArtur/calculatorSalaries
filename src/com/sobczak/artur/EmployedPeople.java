package com.sobczak.artur;

public class EmployedPeople {
    String name, secondName, surname, address;
    int age, pesel, phone;

//    public EmployedPeople(String name, String secondName, String surname, String address, int age, int pesel, int phone){
//        this.name = name;
//        this.secondName = secondName;
//        this.surname = surname;
//        this.address = address;
//        this.age = age;
//        this.pesel = pesel;
//        this.phone = phone;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
