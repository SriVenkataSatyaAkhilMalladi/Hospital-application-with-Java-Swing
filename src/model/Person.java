/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class Person {
    
    private String name;
    private String patientId;
    private int age;
    private String gender;
    private String number;
    private String email;
    private String city;
    private String community;
    private String address;
    private String hospital;
    
    public Person(String name, String patientId, int age, String gender, String phoneNumber, String email, String address, String city, String community, String hospital) 
    {
        this.name = name;
        this.patientId = patientId;
        this.age = age;
        this.gender = gender;
        this.number = phoneNumber;
        this.email = email;
        this.address = address;
        this.city = city;
        this.community = community;
        this.hospital = hospital;
    }
    
    public Person(){}
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
