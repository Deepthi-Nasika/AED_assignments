/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Student;

/**
 *
 * @author nasik
 */
public class Student {
    
    private String studentID;
    private String studentName;
    private String studentEmail;
    private String profRate;
    private String GPA;
    private String creditsCompleted;
    private String studDegree;
    private String degreeStatus;

    
   

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getProfRate() {
        return profRate;
    }

    public void setProfRate(String profRate) {
        this.profRate = profRate;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(String creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }

    public String getStudDegree() {
        return studDegree;
    }

    public void setStudDegree(String studDegree) {
        this.studDegree = studDegree;
    }

    public String getDegreeStatus() {
        return degreeStatus;
    }

    public void setDegreeStatus(String degreeStatus) {
        this.degreeStatus = degreeStatus;
    }
    
    @Override
    public String toString(){
        return studentName;
    }
    
}
