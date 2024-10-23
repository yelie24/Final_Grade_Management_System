/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.grademanagementsystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Vector;

public class Delete_Student extends javax.swing.JInternalFrame {

   private DefaultTableModel tableModel;
   
    public Delete_Student() {
        initComponents();
         initComponents(); // Initialize components
        initializeTable(); // Initialize the table model
        displayFileInTable(); // Load and display data from file
        
   
    }

    private void initializeTable() {
        String[] columns = { "First Name", "Last Name", "Student Number", "Year Level", "Prelim", "Midterm", "Final", "GPA", "Remarks" };
        tableModel = new DefaultTableModel(columns, 0);
        jTable1.setModel(tableModel); // Ensure jTable1 is set to use the tableModel
    }

    private void displayFileInTable() {
        try (BufferedReader reader = new BufferedReader(new FileReader("testingGMS.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\s+");
                if (data.length >= 22) {
                    String firstName = data[2];
                    String lastName = data[5];
                    String studentNumber = data[8];
                    String yearLevel = data[11];
                    String prelim = data[13];
                    String midterm = data[15];
                    String finalGrade = data[17];
                    String gpa = data[19];
                    String remarks = data[21];

                    Vector<String> row = new Vector<>();
                    row.add(firstName);
                    row.add(lastName);
                    row.add(studentNumber);
                    row.add(yearLevel);
                    row.add(prelim);
                    row.add(midterm);
                    row.add(finalGrade);
                    row.add(gpa);
                    row.add(remarks);

                    tableModel.addRow(row); // Add new row to table model
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading file! Re-click or Contact your Programmer.", "FILE ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        studentnum = new javax.swing.JTextField();
        delete = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(230, 235, 240));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Delete Student");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 153));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel1.setText("Stundent Number:");

        studentnum.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        studentnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentnumActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 153));
        delete.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(355, 355, 355))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(273, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(delete)
                        .addGap(433, 433, 433))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(delete)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void studentnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentnumActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // When delete button is pressed, this part of the program will execute.
        
        String studentNumberToDelete = studentnum.getText().trim(); // Get the student number from the text field
        boolean found = false;

        try {
            // Read the existing data
            BufferedReader reader = new BufferedReader(new FileReader("testingGMS.txt"));
            StringBuilder updatedContent = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\s+");
                if (data.length >= 22) {
                    String studentNumber = data[8]; // Assuming student number is at index 8

                    // If the student number matches, skip this line (delete it)
                    if (studentNumber.equals(studentNumberToDelete)) {
                        found = true; // Student number found
                        continue;
                    }
                }
                updatedContent.append(line).append(System.lineSeparator()); // Append the line if it's not deleted
            }
            reader.close();

            // Write the updated content back to the file
            if (found) {
                PrintWriter writer = new PrintWriter(new FileWriter("testingGMS.txt"));
                writer.print(updatedContent.toString());
                writer.close();

                // Refresh the table display
                tableModel.setRowCount(0); // Clear current table
                displayFileInTable(); // Reload data from file
                JOptionPane.showMessageDialog(this, "Student information deleted successfully.", "SUCCESS!", JOptionPane.INFORMATION_MESSAGE);//if deleted successfully   
            } 
            
            else{
                JOptionPane.showMessageDialog(this, "Student number not found!", "ERROR!", JOptionPane.ERROR_MESSAGE);//if the studnum != to any of the file
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error deleting student information!", "FILE ERROR!", JOptionPane.ERROR_MESSAGE);//if there is an error on the file
        }
    }//GEN-LAST:event_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField studentnum;
    // End of variables declaration//GEN-END:variables
}
