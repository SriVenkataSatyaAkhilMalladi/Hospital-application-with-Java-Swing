/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;

/**
 *
 * @author srivenkatasatyaakhilmalladi
 */
public class CommunityList {
    private ArrayList<Community> communitylist;
    
    public CommunityList() {
        this.communitylist= new ArrayList<Community>();
    }

    public ArrayList<Community> getHistory() {
        return communitylist;
    }

    public void setHistory(ArrayList<Community> communitylist) {
        this.communitylist = communitylist;
    }
    
    public Community addNewCommunity(){
        Community addcommunity = new Community();
        communitylist.add(addcommunity);
        return addcommunity;
    }
    
}
