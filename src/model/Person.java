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
    private String PersonName;
    private int PatientId;
    private int CommunityID;
    private Long PhoneNbr;
    private String City;   

    public String getPersonName() {
        return PersonName;
    }

    public void setPersonName(String PersonName) {
        this.PersonName = PersonName;
    }

    public int getPatientId() {
        return PatientId;
    }

    public void setPatientId(int PatientId) {
        this.PatientId = PatientId;
    }

    public int getCommunityID() {
        return CommunityID;
    }

    public void setCommunityID(int CommunityID) {
        this.CommunityID = CommunityID;
    }

    public Long getPhoneNbr() {
        return PhoneNbr;
    }

    public void setPhoneNbr(Long PhoneNbr) {
        this.PhoneNbr = PhoneNbr;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    
}
