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
public class PersonList {

    private ArrayList<Person> Personlist;
    
    public PersonList(){
        this.Personlist= new ArrayList<Person>();
    }

    public ArrayList<Person> getHistory() {
        return Personlist;
    }

    public void setHistory(ArrayList<Person> Personlist) {
        this.Personlist = Personlist;
    }
    
    public Person addNewPerson(){
        Person addperson = new Person();
        Personlist.add(addperson);
        return addperson;
    }
}
