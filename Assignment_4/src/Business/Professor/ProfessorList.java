/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

import Business.Professor.Professor;
import java.util.ArrayList;

/**
 *
 * @author nasik
 */
public class ProfessorList {

    
    private ArrayList<Professor> ProfessorList;
    
    public ProfessorList() {
        this.ProfessorList = new ArrayList<>();
    }

    public ArrayList<Professor> getProfessorList() {
        return ProfessorList;
    }

    public void setProfessorList(ArrayList<Professor> ProfessorList) {
        this.ProfessorList = ProfessorList;
    }

    public Professor addNewProfessor(){
        Professor newProfessor = new Professor();
        ProfessorList.add(newProfessor);
        return newProfessor;
    }
    public void deleteProfessor(Professor newProfessor){
        ProfessorList.remove(newProfessor);
    }
    
}
