/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Semester;

import Business.Course.Course;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nasik
 */
public class SemesterList {
    
    private List<Semester> semlist;

    public SemesterList() {
        this.semlist = new ArrayList<>();
    }
    
    public Semester addSemester(String name) {
        if (!semesterExists(name)) {
            Semester sem = new Semester(name);
            semlist.add(sem);
            return sem;
            
        }
        else{
            return null;
        }
    }
    
    // Method to check if a semester exists by name
    public boolean semesterExists(String name) {
        for (Semester semester : semlist) {
            if (semester.getName().equalsIgnoreCase(name)) {
                return true; 
            }
        }
        return false; 
    }
    
    // Method to delete a semester by name
    public void deleteSemester(String name) {
        for (int i = 0; i < semlist.size(); i++) {
            if (semlist.get(i).getName().equalsIgnoreCase(name)) {
                semlist.remove(i);
            }
        }
    }
    
}
