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
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author ESHA
 */
public class AddBook extends javax.swing.JInternalFrame implements commoninterface{
    
    JFileChooser fc;
    File myfile;
    String pic = "";

    public AddBook() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Add New Book");
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(28, 27, 70, 14);

        jLabel2.setText("Author");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(28, 74, 70, 14);

        jLabel3.setText("Publisher");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(28, 123, 80, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(121, 21, 170, 20);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(121, 71, 170, 20);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(121, 120, 170, 20);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(121, 174, 170, 20);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(378, 21, 138, 159);

        jButton1.setText("Add Icon");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(378, 198, 138, 23);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(172, 281, 131, 33);

        jLabel6.setText("Book Id");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(28, 177, 80, 14);

        jLabel4.setIcon(new javax.swing.ImageIcon("E:\\java\\library_system\\images\\project\\gekleurde-boeken-op-achtergrond-4060368.jpg")); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-370, -10, 1060, 490);

        setBounds(0, 0, 665, 451);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         try
        {
            Connection myconnection=DriverManager.getConnection(path+place,uname,password);
            try
            {
                String q="insert into books values(?,?,?,?,?,?)";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                mystatement.setString(1, jTextField1.getText());
                mystatement.setString(2, jTextField2.getText());
                mystatement.setString(3, jTextField3.getText());
                mystatement.setString(4, jTextField4.getText());
            
                String filename="";

                        if(myfile!=null){
                        filename = "Images\\"+new java.util.Date().getTime() + "_" + myfile.getName();//Date.getTime() added for unique file name.
                        int i;
                        FileInputStream rd = null;
                        FileOutputStream outs = null;
                        try {

                            rd = new FileInputStream(myfile);
                            outs = new FileOutputStream(filename);//writing the new file in 'Images' folder, in the project

                            byte[] b = new byte[2048];
                            while ((i = rd.read(b)) > 0) {
                                outs.write(b, 0, i);

                            }
                            JOptionPane.showMessageDialog(rootPane, "File saved");
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, "error" + e.getMessage());
                        } finally {
                            try {
                                rd.close();
                                outs.close();
                            } catch (Exception e) {
                                JOptionPane.showMessageDialog(rootPane, "error in closing file" + e.getMessage());
                            }
                        }
                        }else
                        {
                            filename="Images\\default.png";

                        }
                        
                        mystatement.setString(5, filename);
                        mystatement.setString(6, "0");
                
                
                if(mystatement.executeUpdate()>0)
                {
                    JOptionPane.showMessageDialog(rootPane, "Data Saved Successfully");
                }
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
                jLabel5.setIcon(null);
                filename="";
                myfile=null;
                
                
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        fc = new JFileChooser();
        fc.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                int pos = f.getName().lastIndexOf('.');
                if (pos == -1) {
                    return false;
                } else {
                    String extention = f.getName().substring(pos + 1);//saving the extension
                    String str[] = {"gif", "png", "jpg", "jpeg"};//allowed extentions
                    for (String allwd : str) {

                        if (extention.equalsIgnoreCase(allwd)) {
                            return true;
                        }
                    }
                    return false;
                }

            }

            @Override
            public String getDescription() {

                return "";
            }
        });
        int result = fc.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            myfile = fc.getSelectedFile();

            try {
                jLabel5.setIcon(new ImageIcon(ImageIO.read(myfile)));
            } catch (IOException e) {
                JOptionPane.showMessageDialog(rootPane, "Error");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
