/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Degree;

import Business.Degree.Degree;
import java.util.ArrayList;

/**
 *
 * @author nasik
 */
public class DegreeList {
    private ArrayList<Degree> degreeList;

    public DegreeList() {
        this.degreeList = new ArrayList<Degree>();
    }
     public ArrayList<Degree> getDegreeList() {
        return degreeList;
    }

    public void setDegreeList(ArrayList<Degree> DegreeList) {
        this.degreeList = DegreeList;
    }
    
    public Degree addNewDegree(){
        Degree newDegree = new Degree();
        degreeList.add(newDegree);
        return newDegree;
    }
    
    public void deleteDegree(Degree degree){
        degreeList.remove(degree);
    }
    
    public Degree searchDegree(String sn) {
    
        for (Degree degree : degreeList) {
        
            if (degree.getDegreeName().equals(sn)) {
                return degree; 
            }
        }
        return null; 
    }  
}
