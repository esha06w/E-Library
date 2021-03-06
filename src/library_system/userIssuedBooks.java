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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static library_system.commoninterface.password;
import static library_system.commoninterface.path;
import static library_system.commoninterface.place;
import static library_system.commoninterface.uname;

/**
 *
 * @author ESHA
 */
public class userIssuedBooks extends javax.swing.JInternalFrame {

    /**
     * Creates new form userIssuedBooks
     */
    public userIssuedBooks(String argument) {
        initComponents();
        try
       {
           Connection myconnection=DriverManager.getConnection(path+place,uname,password);
           
           
                try
                {

                    String argumentid;
                    String q1="select * from utable where uname=?";
                    PreparedStatement mystatement1=myconnection.prepareStatement(q1);
                    mystatement1.setString(1,argument);
                    ResultSet myresult1=mystatement1.executeQuery();
                    if(myresult1.next())
                    {
          
                      argumentid=myresult1.getString("id");
                      DefaultTableModel mymodel=(DefaultTableModel)jTable1.getModel();
                      String q="select * from issuedbooks where applicant_id=?";
                      PreparedStatement mystatement=myconnection.prepareStatement(q);
                         mystatement.setString(1,argumentid);
                         ResultSet myresult=mystatement.executeQuery();
                         mymodel.setRowCount(0);
                         if(myresult.next())
                          {
                             do
                                {    String name1,bookid1,author1,publisher1,issuedate1,returndate1;
                                     name1=myresult.getString("name");
                                     bookid1=myresult.getString("book_id");
                                     author1=myresult.getString("author");
                                     publisher1=myresult.getString("publisher");
                                     issuedate1=myresult.getString("issue_date");
                                     returndate1=myresult.getString("return_date");
                                
                                     
                             
                                     mymodel.addRow(new Object[]{name1,bookid1,author1,publisher1,issuedate1,returndate1});
                                }while(myresult.next());
                          }
                          else
                          {
                        JOptionPane.showMessageDialog(rootPane, "No Books Issued");   
                         }      
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setTitle("Issued Books");
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book Id", "Book Name", "Author", "Publisher", "Issue Date", "Return Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 60, 640, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\java\\library_system\\images\\project\\165642597.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1110, 540);

        setBounds(0, 0, 722, 561);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
