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
public class Bank_Account_History {
    
    private ArrayList<Bank_Account> bank_acc_history;
    
    public Bank_Account_History(){
        
        this.bank_acc_history = new ArrayList<Bank_Account>();
    }

    public ArrayList<Bank_Account> getBank_acc_history() {
        return bank_acc_history;
    }

    public void setBank_acc_history(ArrayList<Bank_Account> bank_acc_history) {
        this.bank_acc_history = bank_acc_history;
    }
    
    public Bank_Account addNewBankAccount(){
        
        Bank_Account newBankAccount = new Bank_Account();
        bank_acc_history.add(newBankAccount);
        return newBankAccount;
    }
    
    public void deleteBankAccount(Bank_Account bnk){
        
        bank_acc_history.remove(bnk);
    }
}
