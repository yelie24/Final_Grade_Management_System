/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.grademanagementsystem;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

public class Display_Page extends javax.swing.JInternalFrame {

    // Table model for jTable1
    private DefaultTableModel tableModel;
    
    public Display_Page() {
        initComponents();    // Initialize components
        initializeTable();   // Initialize the table model
        displayFileInTable(); // Load and display data from file
    }

     // Initialize the table model for jTable1
    private void initializeTable() {
        // Set column names for the table
        String[] columns = { "First Name", "Last Name", "Student Number", "Year Level", "Prelim", "Midterm", "Final", "GPA", "Remarks" };
        
        // Create a table model with the column headers and no rows initially
        tableModel = new DefaultTableModel(columns, 0);
        
        // Set the model for jTable1
        jTable1.setModel(tableModel);
    }

    // Method to display the file content in jTable1
    private void displayFileInTable() {
        try (BufferedReader reader = new BufferedReader(new FileReader("testingGMS.txt"))) {
            String line;

            // Read the file line by line
            while ((line = reader.readLine()) != null) {
                // Split the line into parts based on spaces
                String[] data = line.split("\\s+"); // If using a different delimiter, update it accordingly.

                // Make sure the line has the correct number of parts (adjust if necessary)
                if (data.length >= 22) {  // Ensure enough elements in 'data' array
                    // Extract relevant data from the line based on the expected format
                    String firstName = data[2];   // Extract "First Name"
                    String lastName = data[5];    // Extract "Last Name"
                    String studentNumber = data[8];   // Extract "Student Number"
                    String yearLevel = data[11];  // Extract "Year Level"
                    String prelim = data[13];     // Extract "Prelim"
                    String midterm = data[15];    // Extract "Midterm"
                    String finalGrade = data[17]; // Extract "Final"
                    String gpa = data[19];        // Extract "GPA"
                    String remarks = data[21];    // Extract "Remarks"

                    // Create a new row vector to add to the table model
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

                    // Add the row to the table model
                    tableModel.addRow(row);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error reading file!", "File Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(230, 235, 240));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel2.setText("Display Student");

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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 437, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(361, 361, 361))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())))
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}