
package javaapplication32;

import javax.swing.JOptionPane;


public class JavaApplication32 {

  
    public static void main(String[] args) {
       int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
       
       while(numero > 0){
       int operacion = 0;
       operacion = numero * numero;
           JOptionPane.showMessageDialog(null, "el cuadrado es:"+operacion);
           numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
       }
    }
    
}
