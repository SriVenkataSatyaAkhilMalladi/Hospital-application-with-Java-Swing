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
    private ArrayList<Person> list0;
    
    public PersonList()
    {
    this.list0 = new ArrayList<Person>();
    } 

    public ArrayList<Person> getList0() {
        return list0;
    }

    public void setList0(ArrayList<Person> list0) {
        this.list0 = list0;
    }
    public Person addPerson(){
        Person  newPerson = new Person();
        list0.add(newPerson);
        return newPerson;
    }
}