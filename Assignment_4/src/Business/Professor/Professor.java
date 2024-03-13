/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

/**
 *
 * @author nasik
 */
public class Professor {
    private String profId;
    private String profName;
    private String profEmail;
    private String studGPA;
    private String studID;

    public String getProfId() {
        return profId;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfEmail() {
        return profEmail;
    }

    public void setProfEmail(String profEmail) {
        this.profEmail = profEmail;
    }

    public String getStudGPA() {
        return studGPA;
    }

    public void setStudGPA(String studGPA) {
        this.studGPA = studGPA;
    }

    public String getStudID() {
        return studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }
    
    
    @Override
    public String toString(){
        return profId;
    }


    
}
