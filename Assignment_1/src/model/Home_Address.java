/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nasik
 */
public class Home_Address {
    
    private String name;
    private String adr_1;
    private String adr_2;
    private String city;
    private String state;
    private String zipcode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdr_1() {
        return adr_1;
    }

    public void setAdr_1(String adr_1) {
        this.adr_1 = adr_1;
    }

    public String getAdr_2() {
        return adr_2;
    }

    public void setAdr_2(String adr_2) {
        this.adr_2 = adr_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    
    @Override
     public String toString(){
         return name; 
     }
    
}
