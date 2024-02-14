/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personProfile;

import java.util.ArrayList;

/**
 *
 * @author nasik
 */
public class PersonDirectory {
    
    private ArrayList<Person> personList;

    public PersonDirectory() {
        this.personList = new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonsList() {
        return personList;
    }

    public void setPersonsList(ArrayList<Person> personsList) {
        this.personList = personList;
    }
    
    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
    
    public Person searchPerson(String inpstr){
        for(Person person: personList){
            if((person.getFirstName().equals(inpstr)) || (person.getLastName().equals(inpstr)
                    || (person.getHomeadr().getStreetAdr().equals(inpstr)) 
                    || (person.getWorkadr().getStreetAdr().equals(inpstr)))){
                return person;
            }
        }
        return null;
    }
    
}
