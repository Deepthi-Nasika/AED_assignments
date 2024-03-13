/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

import Business.Student.Student;
import java.util.ArrayList;

/**
 *
 * @author nasik
 */
public class StudentList {
    private ArrayList<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> StudentList) {
        this.studentList = StudentList;
    }
   
    public Student addNewStudent(){
        Student newStudent = new Student();
        studentList.add(newStudent);
        return newStudent;
    }
    
    public void deleteStudent(Student student){
        studentList.remove(student);
    }
    
    public Student searchStudent(String sId) {
    
        for (Student student : studentList) {
        
            if (student.getStudentID().equals(sId)) {
            return student; 
            }
        }
        return null; 
    }
    
    public Student searchStudentName(String sn) {
    
        for (Student student : studentList) {
        
            if (student.getStudentName().equals(sn)) {
                return student; 
            }
        }
        return null; 
    }
}
