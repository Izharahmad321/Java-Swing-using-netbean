
package guiapp;
import javax.swing.*;
import java.awt.*;
import java.util.*;


public class mygui {
    
    
    JFrame frm;
    JPanel pnl;
    JTextField tft;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JButton btn7;
    JButton btn8;
    JButton btn9;
    JButton btn0;
    JButton btnplus;
    JButton btnminus;
    JButton btnmul;
    JButton btndiv;
    JButton btndot;   
    JButton btnequal;
   
   
    
    mygui(){     
      
      new_gui();  
    }
    
    void new_gui(){
        frm=new JFrame("My First Application");
        Container con=frm.getContentPane();
        con.setLayout(new BorderLayout());
         tft=new JTextField(15);
        
        btn1=new JButton("1");
        btn2=new JButton("2");
        btn3=new JButton("3");
        btn4=new JButton("4");
        btn5=new JButton("5");
        btn6=new JButton("6");
        btn7=new JButton("7");
        btn8=new JButton("8");
        btn9=new JButton("9");
        btn0=new JButton("0");
        btnplus=new JButton("+");
        btnminus=new JButton("-");
        btnmul=new JButton("x");
        btndiv=new JButton("/");
        btndot=new JButton(".");
        btnequal=new JButton("=");
      
         pnl=new JPanel(new GridLayout(4, 4));
         pnl.add(btn1);
         pnl.add(btn2);
         pnl.add(btn3);
         pnl.add(btndiv);
         pnl.add(btn4);
         pnl.add(btn5);
         pnl.add(btn6);
         pnl.add(btnmul);
         pnl.add(btn7);
         pnl.add(btn8);
         pnl.add(btn9);
         pnl.add(btnminus);
         pnl.add(btn0);
         pnl.add(btndot);
         pnl.add(btnequal);
         pnl.add(btnplus);
         
         con.add(tft,BorderLayout.NORTH);        
         con.add(pnl,BorderLayout.CENTER);
     
        
        frm.setSize(320, 300);
        frm.setVisible(true);
        
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
