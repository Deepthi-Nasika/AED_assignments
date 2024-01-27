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
public class Home_Address_History {
    
    private ArrayList<Home_Address> home_adr_history;
    
    public Home_Address_History(){
        this.home_adr_history = new ArrayList<Home_Address>();
    }

    public ArrayList<Home_Address> getHome_adr_history() {
        return home_adr_history;
    }

    public void setHome_adr_history(ArrayList<Home_Address> home_adr_history) {
        this.home_adr_history = home_adr_history;
    }
    
    public Home_Address addNewHomeAddress(){
        
        Home_Address newHomeAddress = new Home_Address();
        home_adr_history.add(newHomeAddress);
        return newHomeAddress;
    }
    
    public void deleteHomeAddress(Home_Address hm){
        
        home_adr_history.remove(hm);
    }
    
}
