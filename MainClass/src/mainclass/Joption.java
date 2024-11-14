
package mainclass;

import javax.swing.JOptionPane;
public class Joption {
    public void cutedispl()
    {//message yg masa mula ii masuk
       JOptionPane.showMessageDialog(null, "Welcome sahabat", "Greeting", JOptionPane.INFORMATION_MESSAGE);

        // terima user input
        String userInput = JOptionPane.showInputDialog("What is your name?");
        
        // tunjukkkan message skali dgn user input tadi
        JOptionPane.showMessageDialog(null, "Hello,sahabatku " + userInput + "! Seronok kita dapat berjumpa", "Greeting", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
