/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.ProfessorLogin;

/**
 *
 * @author nasik
 */
public class ProfessorLogin {
    
    private String profUsername;
    private String profPassword;

    public String getProfUsername() {
        return profUsername;
    }

    public void setProfUsername(String profUsername) {
        this.profUsername = profUsername;
    }

    public String getProfPassword() {
        return profPassword;
    }

    public void setProfPassword(String profPassword) {
        this.profPassword = profPassword;
    }
    
    @Override
    public String toString(){
        return profUsername;
    } 
}
