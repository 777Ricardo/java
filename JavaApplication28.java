
package javaapplication28;

import javax.swing.JOptionPane;

public class JavaApplication28 {

    public static void main(String[] args) {
int numero1 = Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero 1: ")); // string cadenas de caracteres
int numero2 = Integer.parseInt(JOptionPane.showInputDialog(" Digite el numero 2: "));
if(numero1 > numero2){
    JOptionPane.showMessageDialog(null, " numero 1 es mayor ");
}
else if(numero2 > numero1){
    JOptionPane.showMessageDialog(null, " numero 2 es mayor ");
}
else{  // pedir 2 numero por 
    JOptionPane.showMessageDialog(null, " los numero son iguales");
}
    }
    
}
