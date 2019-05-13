
package guiapp;
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class mygui {
    
    
    JFrame frm;
    JLabel lbl;
    JTextField tft;
    JButton btn;
    mygui(){
        
        frm=new JFrame("My First Application");
        Container con=frm.getContentPane();
        con.setLayout(new FlowLayout());
        
        lbl=new JLabel("Enter your name : ");
        tft=new JTextField(15);
        btn=new JButton("Click me");
        
        con.add(lbl);
        con.add(tft);
        con.add(btn);
        
        frm.setSize(500, 300);
        frm.setVisible(true);
        
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
    }
    
}
