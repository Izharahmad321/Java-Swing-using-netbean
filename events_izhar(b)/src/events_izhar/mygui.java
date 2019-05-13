
package events_izhar;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.*;


public class mygui implements MouseWheelListener{
    
      JFrame frm;
      JLabel lbl;
      JTextField tft;
      JButton btn;
      JButton btn1;
      JTextField tft1;
      JTextArea tfa;
      JLabel lbl1;
      
      mygui(){
          frm=new JFrame("Action listner Event");
          Container con=frm.getContentPane();
          con.setLayout(new FlowLayout());
            
          lbl=new JLabel("Enter your message : ");
          tft=new JTextField(25);
          btn=new JButton("Click me!");
          btn1=new JButton("Ok");
          tft1=new JTextField(25);
          tfa=new JTextArea(15, 25);
          lbl1=new JLabel("");
          
          con.add(lbl);
          con.add(tft);
          con.add(btn);
          con.add(btn1);
          con.add(tft1);
          //con.add(tfa);
         // con.add(lbl1);
         //btn.addMouseListener(this);
        // btn.addMouseMotionListener(this);
        btn.addMouseWheelListener(this);
       
          
          frm.setSize(300, 300);
          frm.setVisible(true);
          frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }

    
    public void actionPerformed(ActionEvent e) {
        
       
        
         
//         if(e.getSource()==btn1){
//         JOptionPane.showMessageDialog(frm, "This is ok button");
//         }
        
       
    }

  
    public void mouseClicked(MouseEvent e) {
        
    }

    
    public void mousePressed(MouseEvent e) {
      
    }

  
    public void mouseReleased(MouseEvent e) {
        
    }

  
    public void mouseEntered(MouseEvent e) {
       
    }

   
    public void mouseExited(MouseEvent e) {
       
    }

   
    public void mouseDragged(MouseEvent e) {
       
    }

  
    public void mouseMoved(MouseEvent e) {
     
    }

   
    public void mouseWheelMoved(MouseWheelEvent e) {
          if(e.getSource()==btn){
          tft1.setText(tft.getText());
          tft.setText("");
         }
    }
}
