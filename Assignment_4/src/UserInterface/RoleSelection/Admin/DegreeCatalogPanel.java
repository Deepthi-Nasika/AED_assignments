/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.RoleSelection.Admin;

import Business.Course.Course;
import Business.Course.CourseList;
import Business.Degree.Degree;
import Business.Degree.DegreeList;
import Business.Professor.ProfessorList;
import Business.ProfessorLogin.ProfessorLoginList;
import Business.Student.StudentList;
import Business.StudentLogin.StudentLoginList;
import java.awt.CardLayout;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nasik
 */
public class DegreeCatalogPanel extends javax.swing.JPanel {

    /**
     * Creates new form DegreeCatalogPanel
     */
   JPanel userProcessContainer;
    ProfessorList professorList;
    ProfessorLoginList professorLoginList;
    CourseList courseList;
    StudentList studentList;
    StudentLoginList studentLoginList;
    DegreeList degreeList; 
    HashMap<String, List<Course>> studentCour;
    
    public DegreeCatalogPanel(JPanel userProcessConatiner,ProfessorList professorList, ProfessorLoginList professorLoginList, CourseList courseList, StudentList studentList, StudentLoginList studentLoginList,HashMap<String, List<Course>> studentCour, DegreeList degreeList) {
        initComponents();
        this.userProcessContainer = userProcessConatiner;
        this.professorList = professorList;
        this.professorLoginList = professorLoginList;
        this.courseList = courseList;
        this.studentList = studentList;
        this.studentLoginList = studentLoginList;
        this.degreeList = degreeList;
        this.studentCour= studentCour;
        populateDegreeTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDegree = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDegree = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblDegreeName = new javax.swing.JLabel();
        lblRequiredCredits = new javax.swing.JLabel();
        lblRequiredGPA = new javax.swing.JLabel();
        txtDegreeName = new javax.swing.JTextField();
        txtRequiredCredits = new javax.swing.JTextField();
        txtRequiredGPA = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 153, 153));

        lblDegree.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDegree.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDegree.setText("DEGREE");

        tblDegree.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Degree Name", "Required Credits", "Required GPA"
            }
        ));
        jScrollPane1.setViewportView(tblDegree);

        btnAdd.setBackground(new java.awt.Color(204, 204, 255));
        btnAdd.setText("ADD DEGREE");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(204, 204, 255));
        btnUpdate.setText("UPDATE DEGREE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(204, 204, 255));
        btnDelete.setText("DELETE DEGREE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblDegreeName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDegreeName.setText("Degree Name");

        lblRequiredCredits.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRequiredCredits.setText("Required Credits");

        lblRequiredGPA.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRequiredGPA.setText("Required GPA");

        txtRequiredCredits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRequiredCreditsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(204, 204, 255));
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
                .addContainerGap()
                .addComponent(lblDegree, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(27, 27, 27)
                                            .addComponent(lblRequiredGPA))
                                        .addComponent(lblRequiredCredits, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblDegreeName, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGap(35, 35, 35)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtRequiredCredits)
                                        .addComponent(txtDegreeName)
                                        .addComponent(txtRequiredGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(173, 173, 173))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnAdd)
                                    .addGap(47, 47, 47)
                                    .addComponent(btnUpdate)
                                    .addGap(50, 50, 50)
                                    .addComponent(btnDelete)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDegree)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDegreeName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDegreeName))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequiredCredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRequiredGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRequiredGPA))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addContainerGap(83, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String degreeName = txtDegreeName.getText();
        String requiredCredits = txtRequiredCredits.getText();
        String requiredGPA = txtRequiredGPA.getText();
        Degree d= degreeList.addNewDegree();
        d.setDegreeName(degreeName);
        d.setRequiredCredits(requiredCredits);
        d.setRequiredGPA(requiredGPA);
        populateDegreeTable();

        JOptionPane.showMessageDialog(this, "Degree added");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String degreeName = txtDegreeName.getText();
        String requiredCredits = txtRequiredCredits.getText();
        String requiredGPA = txtRequiredGPA.getText();
        DefaultTableModel model= (DefaultTableModel) tblDegree.getModel();
        int selectedRowIndex = tblDegree.getSelectedRow();
        Degree selectedDegree = (Degree) model.getValueAt(selectedRowIndex, 0);
        selectedDegree.setDegreeName(degreeName);
        selectedDegree.setRequiredCredits(requiredCredits);
        selectedDegree.setRequiredGPA(requiredGPA);
        populateDegreeTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDegree.getSelectedRow();
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblDegree.getModel();
        Degree selectedDegree = (Degree) model.getValueAt(selectedRowIndex, 0);
        degreeList.deleteDegree(selectedDegree);
        JOptionPane.showMessageDialog(this, "Degree deleted.");
        populateDegreeTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtRequiredCreditsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRequiredCreditsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRequiredCreditsActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDegree;
    private javax.swing.JLabel lblDegreeName;
    private javax.swing.JLabel lblRequiredCredits;
    private javax.swing.JLabel lblRequiredGPA;
    private javax.swing.JTable tblDegree;
    private javax.swing.JTextField txtDegreeName;
    private javax.swing.JTextField txtRequiredCredits;
    private javax.swing.JTextField txtRequiredGPA;
    // End of variables declaration//GEN-END:variables

        private void populateDegreeTable() {
    DefaultTableModel model = (DefaultTableModel) tblDegree.getModel();
    model.setRowCount(0);
    for (int i = 0; i < degreeList.getDegreeList().size(); i++){
       
        Degree d = degreeList.getDegreeList().get(i);
        
        Object[] row = new Object[3];
        row[0] = d; 
        row[1] = d.getRequiredCredits();
        row[2] = d.getRequiredGPA();
        model.addRow(row);
    }
}


}
;