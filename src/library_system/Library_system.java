

package library_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ESHA
 */
public class Library_system implements commoninterface{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        try
        {
            Connection myconnection=DriverManager.getConnection(path+place,uname,password);
            try
            {
                String q="select * from atable";
                PreparedStatement mystatement=myconnection.prepareStatement(q);
                ResultSet myresult=mystatement.executeQuery();
                if(myresult.next())
                {
                   
                 login obj=new login();
                    obj.setVisible(true);
                     
                }
                else
                {
                    createAdmin obj1=new createAdmin();
                    obj1.setVisible(true);
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error Establishing Query " + e.getMessage());
            }
            finally
            {
                myconnection.close();
            }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Error Establishing Connection " + e.getMessage());
        }
    }
    
    
    
}
