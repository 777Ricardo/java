package javaapplication27;

import javax.swing.JOptionPane;

public class JavaApplication27 {
        public static void main(String[] args) {
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero"));
    if(numero %10 == 0){ // si  50 / 10 = 5 %
        JOptionPane.showMessageDialog(null, " Es multiplo");
    }
    else{
        JOptionPane.showMessageDialog(null, " no es multiplo");
    }
                          // el residuo %
               
                }
    
}
