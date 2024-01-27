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
public class Local_Address_History {
    
    private ArrayList<Local_Address> local_adr_history;
    
    public Local_Address_History(){
        
        this.local_adr_history = new ArrayList<Local_Address>();
    }

    public ArrayList<Local_Address> getLocal_adr_history() {
        return local_adr_history;
    }

    public void setLocal_adr_history(ArrayList<Local_Address> local_adr_history) {
        this.local_adr_history = local_adr_history;
    }
    
    public Local_Address addNewLocalAddress(){
        
        Local_Address newLocalAddress = new Local_Address();
        local_adr_history.add(newLocalAddress);
        return newLocalAddress;
        
    }
    
    public void deleteLocalAddress(Local_Address lcl){
        
        local_adr_history.remove(lcl);
    }
    
    
}
