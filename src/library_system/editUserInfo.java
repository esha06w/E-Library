/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author ESHA
 */
public class editUserInfo extends javax.swing.JInternalFrame implements commoninterface{

    /**
     * Creates new form editUserInfo
     */
    public editUserInfo() {
        initComponents();
    }
    String argument;
    public editUserInfo(String displayname) {
        initComponents();
        argument=displayname;
        try
        {
            Connection myconnection=DriverManager.getConnection(path+place,uname,password);
            try
            {
                String q="select * from utable where uname=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1,argument);
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                    String name1,id1,gender1,email1;
                    java.util.Date dob1;
                    name1=myresult.getString("name");
                    id1=myresult.getString("id");
                    gender1=myresult.getString("gender");
                    dob1=myresult.getDate("dob");
                    email1=myresult.getString("email");
                    
                    jLabel4.setText(argument);
                    jTextField1.setText(name1);
                    jTextField2.setText(id1);
                    if(gender1.equalsIgnoreCase("Female"))
                        jRadioButton2.setSelected(true);
                    else
                        jRadioButton1.setSelected(true);
                    jDateChooser1.setDate(dob1);
                    jTextField4.setText(email1);
                    
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Establishing Query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error Establishing Connection " + e.getMessage());
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Edit Profile");
        getContentPane().setLayout(null);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(210, 70, 151, 18);

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(210, 230, 161, 18);

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(210, 100, 151, 18);

        jDateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(210, 180, 153, 24);

        jButton1.setText("Save");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(268, 289, 122, 32);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 70, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 150, 70, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Id");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 110, 50, 17);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Male");
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(210, 140, 70, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 30, 90, 17);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Female");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(279, 140, 80, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Date of Birth");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 190, 100, 17);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Current Email Address");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 230, 170, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 30, 151, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon("E:\\java\\library_system\\images\\project\\1user-edit-icon-2729.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, -30, 730, 480);

        setBounds(0, 0, 455, 459);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try
        {
            Connection myconnection=DriverManager.getConnection(path+place,uname,password);
            try
            {
                String q="update utable set name=?, id=?, gender=?, dob=?, email=? where uname=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1, jTextField1.getText());
                mystatement.setString(2, jTextField2.getText());
                
                if(jRadioButton1.isSelected())
                {
                    mystatement.setString(3, "Male");
                }
                else if(jRadioButton2.isSelected())
                {
                    mystatement.setString(3, "Female");
                }
                SimpleDateFormat myformat=new SimpleDateFormat("yyyy-MM-dd");
                String bdate=myformat.format(jDateChooser1.getDate());
                mystatement.setString(4, bdate);
                mystatement.setString(5, jTextField4.getText());
                mystatement.setString(6, argument);

                if(mystatement.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Data Updated Successfully");
                }
                jTextField1.setText("");
                jTextField2.setText("");
                
                buttonGroup1.clearSelection();
                jDateChooser1.setDate(null);
                jTextField4.setText("");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "Error Establishing Query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(rootPane, "Error Establishing Connection " + e.getMessage());
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
