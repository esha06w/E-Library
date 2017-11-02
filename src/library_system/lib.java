/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_system;
/**
 *
 * @author ESHA
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import static java.lang.System.exit;

public class lib extends JPanel implements ActionListener{
    
    JFrame f=new JFrame();
    int i=0;
    JLabel h=new JLabel();
    ImageIcon a;
    Timer clock =new Timer(300,this);
    public void func(){
        add(h);
        clock.start();
        f.setSize(850,400);
        f.add(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        i=i+1;    
        a=new ImageIcon("E:\\java\\library_system\\elib\\images"+i+".png");
        this.remove(h);
         h= new JLabel(a);
         add(h);
         if(i==8){
             
        login obj=new login();
        obj.setVisible(true);
        f.setVisible(false);
          }
         validate();
         
    }
    public static void main(String[] args){
        lib obj1=new lib();
        obj1.func();
    }
 
}
