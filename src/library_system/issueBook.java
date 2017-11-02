/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package library_system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ESHA
 */
public class issueBook extends javax.swing.JInternalFrame implements commoninterface {

    public issueBook() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Issue Book");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Book Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 29, 90, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 74, 80, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Author");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(28, 123, 80, 17);

        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(143, 21, 170, 18);

        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField2);
        jTextField2.setBounds(143, 71, 170, 18);

        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField3);
        jTextField3.setBounds(143, 120, 170, 18);

        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField4);
        jTextField4.setBounds(143, 172, 170, 18);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(470, 30, 138, 159);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Save Changes");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(265, 426, 131, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Publisher");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(28, 175, 90, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Search");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(330, 20, 100, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Issue Book");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(28, 260, 100, 17);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Yes");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(143, 256, 80, 23);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("No");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(243, 256, 70, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(140, 210, 220, 28);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Applicant Name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(28, 300, 120, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Applicant Id");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(28, 338, 110, 17);

        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField5);
        jTextField5.setBounds(150, 300, 170, 18);

        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jTextField6);
        jTextField6.setBounds(150, 340, 170, 18);

        jLabel10.setIcon(new javax.swing.ImageIcon("E:\\java\\library_system\\images\\project\\images1.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(-50, -50, 750, 570);

        setBounds(0, 0, 695, 525);
    }// </editor-fold>//GEN-END:initComponents

    int issued1;
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try
       {
           Connection myconnection=DriverManager.getConnection(path+place,uname,password);
           try
           {
               String q="select * from books where book_id=?";
               PreparedStatement mystatement=myconnection.prepareStatement(q);
               mystatement.setString(1, jTextField1.getText());
               ResultSet myresult=mystatement.executeQuery();
               if(myresult.next())
               {
                   String name1,author1,publisher1,bookid1;
                   
                   name1=myresult.getString("name");
                   author1=myresult.getString("author");
                   publisher1=myresult.getString("publisher");
                   bookid1=myresult.getString("book_id");
                   issued1=myresult.getInt("issued");
                   jTextField1.setText(bookid1);
                   jTextField2.setText(name1);
                   jTextField3.setText(author1);
                   jTextField4.setText(publisher1);
                  
                   jLabel5.setIcon(new ImageIcon(ImageIO.read(new File(myresult.getString("icon")))));
                   if(issued1==1)
                   {
                       jLabel7.setText("ISSUED");
                   }
                   else
                   {
                       jLabel7.setText("NOT ISSUED");
                   }
               }
               else
               {
                   JOptionPane.showMessageDialog(rootPane, "Book Id does not exist");
                   jTextField1.setText("");
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
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
        {
            Connection myconnection=DriverManager.getConnection(path+place,uname,password);
            try
            {
                String q="update books set issued=? where book_id=?";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                
                if(jRadioButton1.isSelected())
                {
                    mystatement.setString(1, "1");
                }
                else if(jRadioButton2.isSelected())
                {
                    mystatement.setString(1, "0");
                }
                mystatement.setString(2, jTextField1.getText());

                if(mystatement.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Data Updated Successfully");
                    String q1="select * from books where book_id=?";
                    PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                    mystatement1.setString(1, jTextField1.getText());
                    int ch=0;
                    ResultSet myresult1=mystatement1.executeQuery();
                
                    if(myresult1.next())
                    {
          
                    ch=myresult1.getInt("issued");
            
                    }
                    if(ch==1)
                    {
                    String q2="insert into issuedbooks values(?,?,?,?,?,?,?,?)";
                    PreparedStatement mystatement2=myconnection.prepareStatement(q2);
                    mystatement2.setString(1, jTextField1.getText());
                    mystatement2.setString(2, jTextField2.getText());
                    mystatement2.setString(3, jTextField3.getText());
                    mystatement2.setString(4, jTextField4.getText());
                    
                    SimpleDateFormat myformat1=new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date cdate=new java.util.Date();
                    String bdate1=myformat1.format(cdate);
                    mystatement2.setString(5, bdate1);
                    
                    SimpleDateFormat myformat2=new SimpleDateFormat("yyyy-MM-dd");
                    java.util.Date cdate2=new java.util.Date();
                    Calendar c = Calendar.getInstance();
                    c.setTime(cdate2); 
                    c.add(Calendar.DATE, 20);
                    String bdate2=myformat2.format(c.getTime());
                    mystatement2.setString(6, bdate2);
                    
                    mystatement2.setString(7, jTextField5.getText());
                    mystatement2.setString(8, jTextField6.getText());
                    
                            
                    if(mystatement2.executeUpdate()>0)
                    {
                    JOptionPane.showMessageDialog(rootPane, "Issued...");
                    }
                            
                }
                    
                }

                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jLabel5.setIcon(null);
                jLabel7.setText("");
                buttonGroup1.clearSelection();
                jTextField5.setText("");
                jTextField6.setText("");
                
            
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
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
         try
       {
           Connection myconnection=DriverManager.getConnection(path+place,uname,password);
           try
           {
              
                   if(issued1==1)
                   {
                       JOptionPane.showMessageDialog(rootPane, "Cannot be issued");
                       jRadioButton2.setSelected(true);
                   }
                 
                      
           }
           catch(Exception e)
           {
                  JOptionPane.showMessageDialog(rootPane, "Error" + e.getMessage());
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
        
        
    }//GEN-LAST:event_jRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
