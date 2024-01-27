/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author nasik
 */
public class PersonHistory {
    
    private ArrayList<Person> person_history;
    
    public PersonHistory(){
        
        this.person_history = new ArrayList<Person>();
    }

    public ArrayList<Person> getPerson_history() {
        return person_history;
    }

    public void setPerson_history(ArrayList<Person> person_history) {
        this.person_history = person_history;
    }
    
    public Person addNewPerson(){
        
        Person newPerson = new Person();
        person_history.add(newPerson);
        return newPerson;
        
    }
    
    public void deletePerson(Person p){
        
        person_history.remove(p);
    }
    
}
