/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author nasik
 */
public class Bank_Account {
    
    private String name;
    private String bank_name;
    private String acc_type;
    private String acc_no;
    private String debit_amt;
    private String credit_amt;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBank_name() {
        return bank_name;
    }

    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getDebit_amt() {
        return debit_amt;
    }

    public void setDebit_amt(String debit_amt) {
        this.debit_amt = debit_amt;
    }

    public String getCredit_amt() {
        return credit_amt;
    }

    public void setCredit_amt(String credit_amt) {
        this.credit_amt = credit_amt;
    }
    
    @Override
     public String toString(){
         return name; 
     }
    
    
}
