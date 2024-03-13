/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleSelection.Admin;

import Business.Course.Course;
import java.awt.CardLayout;
import javax.swing.JPanel;
import Business.Course.CourseList;
import Business.Degree.DegreeList;
import Business.Professor.ProfessorList;
import Business.ProfessorLogin.ProfessorLoginList;
import Business.Student.StudentList;
import Business.StudentLogin.StudentLoginList;
import UserInterface.RoleSelection.MainJFrame;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nasik
 */
public class AdminViewPanel extends javax.swing.JPanel {
    /**
     * Creates new form AdminViewPanel
     */
    MainJFrame frame;
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    JPanel userProcessContainer;
    DegreeList degreeList;
    HashMap<String, List<Course>> studentCour;
    
    public AdminViewPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList,HashMap<String, List<Course>> studentCour, DegreeList degreeList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList =  courseList;
        this.studentList = studentList;
        this.studentLoginList = studentLoginList;
        this.studentCour = studentCour;
        this.degreeList = degreeList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAdminView = new javax.swing.JLabel();
        btnProfessorCatalog = new javax.swing.JButton();
        btnCourseCatalog = new javax.swing.JButton();
        btnStudentCatalog = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnCourseSchedule = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        lblAdminView.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblAdminView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdminView.setText("Admin");

        btnProfessorCatalog.setBackground(new java.awt.Color(204, 204, 255));
        btnProfessorCatalog.setText("Professor Catalog");
        btnProfessorCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProfessorCatalogActionPerformed(evt);
            }
        });

        btnCourseCatalog.setBackground(new java.awt.Color(204, 204, 255));
        btnCourseCatalog.setText("Course Catalog");
        btnCourseCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseCatalogActionPerformed(evt);
            }
        });

        btnStudentCatalog.setBackground(new java.awt.Color(204, 204, 255));
        btnStudentCatalog.setText("Student Catalog");
        btnStudentCatalog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentCatalogActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setText("Logout");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnReport.setBackground(new java.awt.Color(204, 204, 255));
        btnReport.setText("Report");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnCourseSchedule.setBackground(new java.awt.Color(204, 204, 255));
        btnCourseSchedule.setText("Course Schedule");
        btnCourseSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCourseScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnStudentCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnProfessorCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(btnCourseSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnCourseCatalog, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(lblAdminView, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(193, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(59, 59, 59)
                .addComponent(lblAdminView)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnStudentCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCourseCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProfessorCatalog, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(btnCourseSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnCourseCatalog, btnStudentCatalog});

    }// </editor-fold>//GEN-END:initComponents

    private void btnProfessorCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProfessorCatalogActionPerformed
        // TODO add your handling code here:
        ProfessorCatalogPanel professorcatalog = new ProfessorCatalogPanel(userProcessContainer,professorList, professorLoginList, courseList, studentList, studentLoginList,studentCour, degreeList);          
        userProcessContainer.add("ProfessorCatalog", professorcatalog);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
  
    }//GEN-LAST:event_btnProfessorCatalogActionPerformed

    private void btnStudentCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentCatalogActionPerformed
        // TODO add your handling code here:
        StudentCatalogPanel studentcatalog = new StudentCatalogPanel(userProcessContainer, professorList, professorLoginList,courseList, studentList, studentLoginList,studentCour, degreeList);          
        userProcessContainer.add("StudentCatalog", studentcatalog);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer); 
    }//GEN-LAST:event_btnStudentCatalogActionPerformed

    private void btnCourseCatalogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseCatalogActionPerformed
        // TODO add your handling code here:
        CourseCatalogPanel coursecatalog = new CourseCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList,studentCour, degreeList);          
        userProcessContainer.add("CourseCatalog", coursecatalog);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
  
    }//GEN-LAST:event_btnCourseCatalogActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
        ReportPanel repPanel = new ReportPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, studentCour, degreeList);
        userProcessContainer.add("ReportPanel", repPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnCourseScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCourseScheduleActionPerformed
        // TODO add your handling code here:
        CourseSchedulePanel courseschedule = new CourseSchedulePanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList,studentCour, degreeList);          
        userProcessContainer.add("CourseCatalog", courseschedule);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnCourseScheduleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCourseCatalog;
    private javax.swing.JButton btnCourseSchedule;
    private javax.swing.JButton btnProfessorCatalog;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnStudentCatalog;
    private javax.swing.JLabel lblAdminView;
    // End of variables declaration//GEN-END:variables
}
