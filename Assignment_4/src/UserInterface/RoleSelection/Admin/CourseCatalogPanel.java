/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleSelection.Admin;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Course.Course;
import Business.Course.CourseList;
import Business.Degree.DegreeList;
import Business.Professor.Professor;
import Business.Professor.ProfessorList;
import Business.ProfessorLogin.ProfessorLoginList;
import Business.Student.StudentList;
import Business.StudentLogin.StudentLoginList;
import UserInterface.RoleSelection.MainJFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author nasik
 */
public class CourseCatalogPanel extends javax.swing.JPanel {

    /**
     * Creates new form CourseCatalog
     */
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    MainJFrame frame;
    StudentList studentList;
    StudentLoginList studentLoginList;
    JPanel userProcessContainer;
    DegreeList degreeList;
    HashMap<String, List<Course>> studentCour;
    
    public CourseCatalogPanel(JPanel userProcessContainer,ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList, HashMap<String, List<Course>> studentCour, DegreeList degreeList) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList = studentList;
        this.studentLoginList = studentLoginList;
        this.studentCour =studentCour;
        this.degreeList = degreeList;
        
        populateCourseTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tblCourse1 = new javax.swing.JTable();
        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCourse = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblCourseID = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        txtCourseID = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        lblCoursePrice = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        txtDuration = new javax.swing.JTextField();
        lblCredits = new javax.swing.JLabel();
        txtCredits = new javax.swing.JTextField();
        lblProfName = new javax.swing.JLabel();
        txtProfName = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        tblCourse1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Professor Name"
            }
        ));
        jScrollPane2.setViewportView(tblCourse1);

        setBackground(new java.awt.Color(204, 255, 204));
        setPreferredSize(new java.awt.Dimension(806, 300));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Course Catalog");

        tblCourse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Professor Name", "Course Type"
            }
        ));
        jScrollPane1.setViewportView(tblCourse);

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update Course");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setText("Add Course");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete Course");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblCourseID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCourseID.setText("Course ID:");

        lblCourseName.setText("Course Name:");

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCoursePrice.setText("Course Price:");

        lblDuration.setText("Course Duration:");

        txtPrice.setText(" ");

        txtDuration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDurationActionPerformed(evt);
            }
        });

        lblCredits.setText("Credits:");

        lblProfName.setText("Professor Name:");

        btnView.setBackground(new java.awt.Color(204, 204, 255));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setText("View Course");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(btnAdd)
                                .addGap(50, 50, 50)
                                .addComponent(btnView)
                                .addGap(52, 52, 52)
                                .addComponent(btnUpdate)
                                .addGap(49, 49, 49)
                                .addComponent(btnDelete))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblCredits)
                                                .addComponent(lblCoursePrice)
                                                .addComponent(lblCourseName)
                                                .addComponent(lblDuration))
                                            .addGap(36, 36, 36)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txtDuration)
                                                .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCourseName, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(5, 5, 5)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lblCourseID)
                                                .addComponent(lblProfName))
                                            .addGap(31, 31, 31)
                                            .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(0, 825, Short.MAX_VALUE))
                            .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblCourseID, lblCourseName});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addGap(26, 26, 26)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourseID)
                    .addComponent(txtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfName)
                    .addComponent(txtProfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourseName)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCoursePrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDuration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCredits)
                    .addComponent(txtCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addGap(14, 14, 14))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblCourseID, lblCourseName});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String courseId = txtCourseID.getText();
        String courseName = txtCourseName.getText();
        String price = txtPrice.getText();
        String duration = txtDuration.getText();
        String creds = txtCredits.getText();
        String profName = txtProfName.getText();
        
        if(courseId.isEmpty() || courseName.isEmpty() || price.isEmpty() || duration.isEmpty() || creds.isEmpty() || profName.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter valid course details", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(doesProfessorExist(profName) == false){
            JOptionPane.showMessageDialog(this, "Enter valid prof name", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Course c= courseList.addNewCourse();
        c.setCourseName(courseName);
        c.setCourseId(courseId);
        c.setCoursePrice(price);
        c.setCourseDuration(duration);
        c.setCredits(creds);
        c.setProfCName(profName);
        populateCourseTable();
              
        JOptionPane.showMessageDialog(this, "Course added successfully");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String courseId = txtCourseID.getText();
        String courseName = txtCourseName.getText();
        String price = txtPrice.getText();
        String duration = txtDuration.getText();
        String creds = txtCredits.getText();
        String profName = txtProfName.getText();
        
        DefaultTableModel model= (DefaultTableModel) tblCourse.getModel();
        int selectedRowIndex = tblCourse.getSelectedRow();
        Course c = (Course) model.getValueAt(selectedRowIndex, 0);
        
        c.setCourseName(courseName);
        c.setCourseId(courseId);
        c.setCoursePrice(price);
        c.setCourseDuration(duration);
        c.setCredits(creds);
        c.setProfCName(profName);
        populateCourseTable();
        
        btnUpdate.setEnabled(false);
        
        txtCourseID.setText("");
        txtProfName.setText("");
        txtCourseName.setText("");
        txtPrice.setText("");
        txtDuration.setText("");
        txtCredits.setText("");
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        Course selectedCourse = (Course) model.getValueAt(selectedRowIndex, 0);
        courseList.deleteCourse(selectedCourse);
        JOptionPane.showMessageDialog(this, "Course deleted.");
        populateCourseTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtDurationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDurationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDurationActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblCourse.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        Course c = (Course) model.getValueAt(selectedRowIndex, 0);
        
        txtCourseID.setText(c.getCourseId());
        txtProfName.setText(c.getProfCName());
        txtCourseName.setText(c.getCourseName());
        txtPrice.setText(c.getCoursePrice());
        txtDuration.setText(c.getCourseDuration());
        txtCredits.setText(c.getCredits());
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseID;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblCoursePrice;
    private javax.swing.JLabel lblCredits;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblProfName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblCourse;
    private javax.swing.JTable tblCourse1;
    private javax.swing.JTextField txtCourseID;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtCredits;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtProfName;
    // End of variables declaration//GEN-END:variables
    
    private void populateCourseTable() {
    DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
    model.setRowCount(0);

    for (int i = 0; i < courseList.getCourseList().size(); i++){
        Course c = courseList.getCourseList().get(i);
        
        Object[] row = new Object[4];
        row[0] = c; 
        row[1] = c.getCourseName();
        row[2] = c.getProfCName();
        row[3] = c.getCourseType();
        
        model.addRow(row);
    }
   }
    
    public DefaultTableModel getCourseCatalogTable(){
        DefaultTableModel model = (DefaultTableModel) tblCourse.getModel();
        return model;
    }
    
    public boolean doesProfessorExist(String profName) {
    for (Professor p : professorList.getProfessorList()) {
        if (p.getProfName().equals(profName)) {
            return true; // Professor name matches, return true
        }
    }
    return false; // After checking all, no match found, return false
    }

   
    
    
}
