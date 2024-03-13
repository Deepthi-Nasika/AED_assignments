/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleSelection.Student;

import UserInterface.RoleSelection.Student.StudentDetailsPanel;
import UserInterface.RoleSelection.Admin.StudentCatalogPanel;
import Business.Course.Course;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Course.CourseList;
import Business.Degree.DegreeList;
import Business.Professor.ProfessorList;
import Business.ProfessorLogin.ProfessorLoginList;
import Business.Student.Student;
import Business.Student.StudentList;
import Business.StudentLogin.StudentLogin;
import Business.StudentLogin.StudentLoginList;
import UserInterface.RoleSelection.MainJFrame;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nasik
 */
public class StudentLoginPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentLoginPanel
     */
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    MainJFrame frame;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    JPanel userProcessContainer;
    HashMap<String, List<Course>> studentCour;
    DegreeList degreeList; 
    int rowCount = 0;
    
    public StudentLoginPanel(JPanel userProcessContainer, ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList,  StudentList studentList, StudentLoginList studentLoginList, HashMap<String, List<Course>> studentCour, DegreeList degreeList) {
        initComponents();
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList =studentList;
        this.studentLoginList = studentLoginList;
        this.userProcessContainer = userProcessContainer;
        this.studentCour = studentCour;
        this.degreeList =degreeList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblStudentLoginTitle = new javax.swing.JLabel();
        lblStudentUsername = new javax.swing.JLabel();
        lblStudentPassword = new javax.swing.JLabel();
        txtStudentUsername = new javax.swing.JTextField();
        btnStudentLogin = new javax.swing.JButton();
        txtStudentPassword = new javax.swing.JPasswordField();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBackground(new java.awt.Color(204, 255, 204));

        lblStudentLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblStudentLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentLoginTitle.setText("STUDENT LOGIN");

        lblStudentUsername.setText("Username:");

        lblStudentPassword.setText("Password:");

        btnStudentLogin.setBackground(new java.awt.Color(204, 204, 255));
        btnStudentLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnStudentLogin.setText(" Login");
        btnStudentLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentLoginActionPerformed(evt);
            }
        });

        txtStudentPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentPasswordActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblStudentPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStudentUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnStudentLogin))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblStudentLoginTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(lblStudentLoginTitle)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentUsername)
                    .addComponent(txtStudentUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStudentPassword)
                    .addComponent(txtStudentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnStudentLogin)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStudentLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentLoginActionPerformed
        // TODO add your handling code here:
        StudentCatalogPanel studCatalog = new StudentCatalogPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList, studentCour, degreeList);
        DefaultTableModel studModel = studCatalog.getStudentTable();
        
        String enteredUsername = txtStudentUsername.getText();
        char[] enteredPasswordChar = txtStudentPassword.getPassword();
        String enteredPassword = new String(enteredPasswordChar);
        
        if(studModel.getRowCount()==0)
            JOptionPane.showMessageDialog(this, "No student Registered");
        
        for(int i=0;i < studModel.getRowCount(); i++){
            StudentLogin loginStud = (StudentLogin) studModel.getValueAt(i, 1);
            String username = loginStud.getStudentUsername();
            String password = loginStud.getStudentPassword();
            
            if(enteredUsername.equals(username) && enteredPassword.equals(password)){
              StudentDetailsPanel detailsPanel = new StudentDetailsPanel(userProcessContainer, professorList, professorLoginList, courseList, studentList, studentLoginList,  studentCour, degreeList);
              Student stud = (Student) studModel.getValueAt(i, 0);
              
              detailsPanel.setStudentID(stud.getStudentID());
              detailsPanel.setStudentName(stud.getStudentName());
              detailsPanel.setStudentEmail(stud.getStudentEmail());
              
                userProcessContainer.add("StudentDetailsPanel", detailsPanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);

                break;  
            } else if(enteredUsername.equals(username) && (!enteredPassword.equals(password) )) {
                JOptionPane.showMessageDialog(this, "Wrong Password");
                break;
            }   
        }
    }//GEN-LAST:event_btnStudentLoginActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtStudentPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnStudentLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStudentLoginTitle;
    private javax.swing.JLabel lblStudentPassword;
    private javax.swing.JLabel lblStudentUsername;
    private javax.swing.JPasswordField txtStudentPassword;
    private javax.swing.JTextField txtStudentUsername;
    // End of variables declaration//GEN-END:variables
}