/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Random;


/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class Community {
    public int communityID;
    public String communityName;
    public int pincode;
    Random random = new Random();

    public int getCommunityID() {
        communityID = random.nextInt(5000);
        return communityID;
    }

    public void setCommunityID(int communityID) {
        this.communityID = communityID;
    }
    
    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
}
