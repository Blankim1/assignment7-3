/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment7.pkg3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author Hani
 */
public class DataManager extends javax.swing.JFrame implements FileIO
{

    private LinkedList<Person> personList = new LinkedList<>();
 
    
    public DataManager() {
        initComponents();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMajor = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDepartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtData = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnSort = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnLoad = new javax.swing.JButton();
        radioStudent = new javax.swing.JRadioButton();
        radioEmployee = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        radioSortDepartment = new javax.swing.JRadioButton();
        radioSortID = new javax.swing.JRadioButton();
        radioSortFirstName = new javax.swing.JRadioButton();
        radioSortLastName = new javax.swing.JRadioButton();
        radioSortMajor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel1.setText("Type");

        txtFirstName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel2.setText("First Name");

        txtLastName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setText("Last Name");

        txtMajor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setText("Major");

        txtDepartment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel5.setText("Department");

        txtData.setColumns(20);
        txtData.setRows(5);
        jScrollPane2.setViewportView(txtData);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSort.setText("Sort");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnSave.setText("Save to file");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnLoad.setText("Load from file");
        btnLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioStudent);
        radioStudent.setText("Student");
        radioStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioStudentActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioEmployee);
        radioEmployee.setText("Employee");
        radioEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioEmployeeActionPerformed(evt);
            }
        });

        jLabel6.setText("ID");

        buttonGroup2.add(radioSortDepartment);
        radioSortDepartment.setText("Department");

        buttonGroup2.add(radioSortID);
        radioSortID.setText("ID");
        radioSortID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSortIDActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioSortFirstName);
        radioSortFirstName.setText("First Name");

        buttonGroup2.add(radioSortLastName);
        radioSortLastName.setText("Last Name");

        buttonGroup2.add(radioSortMajor);
        radioSortMajor.setText("Major");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(radioEmployee))
                            .addComponent(radioStudent))
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2)
                        .addGap(9, 9, 9)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabel4)
                        .addGap(23, 23, 23)
                        .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(radioSortID)
                        .addGap(3, 3, 3)
                        .addComponent(radioSortFirstName)
                        .addGap(3, 3, 3)
                        .addComponent(radioSortLastName)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioSortMajor)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(radioSortDepartment)))
                        .addGap(7, 7, 7)
                        .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addGap(10, 10, 10)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(23, 23, 23)
                        .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioEmployee)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioStudent)
                        .addComponent(jLabel1))
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd)
                    .addComponent(btnSave)
                    .addComponent(btnLoad))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(radioSortID)
                    .addComponent(radioSortFirstName)
                    .addComponent(radioSortLastName)
                    .addComponent(radioSortMajor)
                    .addComponent(radioSortDepartment)
                    .addComponent(btnSort, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Read values from GUIT and save them variables
        String id = txtID.getText();
        String firstName = txtFirstName.getText();
        String lastName = txtLastName.getText();
        String major = txtMajor.getText();
        String department = txtDepartment.getText();
        
		// Depending on whether Student or Employee is selected, set the person type, major and / or department
		// Add a Student or Employee to the list if isDataValid() returns true
                if(isDataValid()) 
                {
                    if(radioStudent.isSelected())
                    {
                        Student s1 = new Student(Integer.parseInt(id), firstName, lastName, major);
                        personList.add(s1);
                    }
                    else if(radioEmployee.isSelected())
                    {
                        Employee e1 = new Employee(Integer.parseInt(id), firstName, lastName, department);
                        personList.add(e1);
                    }
                }    
                
                else
                {
                    return;
                }
		
		
        
        
		// Call updateData() then resetGUI()
		updateData(); 
                resetGUI();
                
    }//GEN-LAST:event_btnAddActionPerformed

    private void radioStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioStudentActionPerformed
        // Clear the contents of Department, then disable it
        txtDepartment.setText("");
        txtDepartment.setEnabled(false);
		
		// Enable Major
                txtMajor.setEnabled(true);
                
               
		
		
    }//GEN-LAST:event_radioStudentActionPerformed

    private void radioEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioEmployeeActionPerformed
        // Clear the contents of Major, then disable it
	txtMajor.setText("");
        txtMajor.setEnabled(false);
		
		// Enable Department
		txtDepartment.setEnabled(true);
		
    }//GEN-LAST:event_radioEmployeeActionPerformed

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
        OrderBy sort = OrderBy.LAST_NAME;
        
		// Set the value of sort depending on what sorting option is selected
		
		        
        // Loop every object in the list and call setSortOrder() for each
	if(radioSortID.isSelected())
        {
            sort = OrderBy.ID;
        }
        else if(radioSortFirstName.isSelected())
        {
            sort = OrderBy.FIRST_NAME;
        }
        else if(radioSortLastName.isSelected())
        {
            sort = OrderBy.LAST_NAME;
        }
        else if(radioSortMajor.isSelected())
        {
            sort = OrderBy.MAJOR;
        }
        else if(radioSortDepartment.isSelected())
        {
            sort = OrderBy.DEPARTMENT;
        }
		
        //loop
        
        for(int i= 0; i < personList.size(); i++)
        {
            personList.get(i).setOrder(sort);
        } 
        
        // Sort the list by calling Collections.sort(personList);
	//personList.getFirst().setOrder(sort);
        
        Collections.sort(personList);
        
        
		// Refresh the interface by calling updateData();
		updateData();
		
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // Call saveFile("test.txt") and display a messagebox to the user in case of an exception
        try
        {
            saveFile("test.txt");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadActionPerformed
        // Call loadFile("test.txt") and display a messagebox to the user in case of an exception
	try
        {
            loadFile("test.txt");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }	
    }//GEN-LAST:event_btnLoadActionPerformed

    private void radioSortIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSortIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSortIDActionPerformed

    private void updateData()
    {
        // Clear txtData
		
		// Build the output by looping through the list and calling toString() of each object, add \n at
		// the end of each line, then append to the variable output
		String output = "";
		
                for(int i= 0; i < personList.size(); i++)
                {
                    output = output + personList.get(i).toString() + "\n";
                }
		
		// Insert output in txtData
		txtData.setText(output);
    }
    
    private void resetGUI()
    {
        // Clear the ID, First Name, Last Name, Major and Department GUI elements
	txtID.setText("");
        txtFirstName.setText("");
        txtLastName.setText("");
        txtMajor.setText("");
        txtDepartment.setText("");
    }
	
	private boolean isDataValid()
    {
        // Checks if all the data necessary to create a Student of Employee have been input.
		// If anything is missing, warn the user by using message boxes
        if(txtID.getText().equals("")||
           txtFirstName.getText().equals("")||
           txtLastName.getText().equals("")||
           txtMajor.getText().equals("") && txtMajor.isEnabled()||
           txtDepartment.getText().equals("") && txtDepartment.isEnabled())
        {
            JOptionPane.showMessageDialog(null, "Please fill in all the blanks.");
            return false;
        }
        else
        {
            return true;
        }
		
    }
    
    public void saveFile(String a_fileName) throws FileNotFoundException
    {
        File file = new File(a_fileName);
        PrintWriter pw = new PrintWriter(file);
        // Loop through the list, then output the result of toString() of each object
	for(int i = 0; i < personList.size(); i++)
        {
            Person p1 = personList.get(i);
            
            if(p1 instanceof Student)
            {
                Student s2 = (Student)p1;
                pw.println(s2.toSting());
            }
            else if(p1 instanceof Employee)
            {
                Employee e2 = (Employee)p1;
                pw.println(e2.toString());
            }
            
        }
        // to a new line in the file
		
		// If there were no problems, inform the user through a messagebox
		// that saving has been successfull
        pw.close();
        JOptionPane.showMessageDialog(null, "Saving has been successfull.");
    }
    
    public void loadFile(String a_fileName) throws FileNotFoundException
    {
        // 1- Read the contents of the file line by line
		// 2- For each line, check if it is a Student or Employee (first character in the line)
		// 3- If it's a Student, create a Student object through a Person object using polymorphism
		// 4- If it's an Employee, create an Employee object through a Person object using polymorphism
		// 5- Call person.setInfo() and pass it the line that you read from the file
		// 6- Add person to the list
		//
		// After you read the file, call updateData() to refresh the GUI
		File file = new File(a_fileName);
                Scanner kb = new Scanner(file);
                
                if(true)
                {
                    String str = kb.nextLine();
                    
                    if(str.charAt(0) == PersonType.STUDENT)
                    {
                        Student s3 = new Student();
                        s3.setInfo(str);
                        personList.add(s3);
                    }
                    if(str.charAt(0) == PersonType.EMPLOYEE)
                    {
                        Employee e3 = new Employee();
                        e3.setInfo(str);
                        personList.add(e3);
                    }
                    else
                    {
                        return;
                    }
                    
                    return;
                }
                    
                updateData();
                    
        
		
		// If there were no problems, inform the user through a messagebox
		// that loading has been successfull
                JOptionPane.showMessageDialog(null, "Loading has been successfull.");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnLoad;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSort;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton radioEmployee;
    private javax.swing.JRadioButton radioSortDepartment;
    private javax.swing.JRadioButton radioSortFirstName;
    private javax.swing.JRadioButton radioSortID;
    private javax.swing.JRadioButton radioSortLastName;
    private javax.swing.JRadioButton radioSortMajor;
    private javax.swing.JRadioButton radioStudent;
    private javax.swing.JTextArea txtData;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMajor;
    // End of variables declaration//GEN-END:variables
}
