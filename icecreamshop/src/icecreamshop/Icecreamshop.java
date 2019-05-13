
package icecreamshop;

import javax.swing.UIManager;


public class Icecreamshop {

   
    public static void main(String[] args) {
        
           try {
            // select Look and Feel
            UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
            // start application
          
        }
        catch (Exception ex) {
          
        }
       myframe frm=new myframe();
       frm.setVisible(true);
    }
    
}
