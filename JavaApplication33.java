
package javaapplication33;

import javax.swing.JOptionPane;

public class JavaApplication33 {

    public static void main(String[] args) {
int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));
int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero 1"));

if(numero1 %2 == 0 && numero2 %2 != 0){
    JOptionPane.showMessageDialog(null, numero1+" par "+numero2+ "inpar");
}
else if(numero2 %2 == 0 && numero1 %2 != 0){
    JOptionPane.showMessageDialog(null, numero2+" par "+numero1+"inpar");
        
    }
else if(numero1 %2 == 0 && numero2 %2 == 0){
    JOptionPane.showMessageDialog(null, numero2+" y "+numero1+"los dos son pares");
}
else if(numero1 %2 != 0 && numero2 %2 != 0){
    JOptionPane.showMessageDialog(null, numero2+" y "+numero1+"los dos son inpares");
}
else{
    JOptionPane.showMessageDialog(null, "Tiene errores en la digitacion");
}

    }
    
}
