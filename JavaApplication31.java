
package javaapplication31;

import javax.swing.JOptionPane;

public class JavaApplication31 {

    public static void main(String[] args) {
int horas_trabajadas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de horas que trabajo"));
int operacion;    
if( horas_trabajadas > 40){
    operacion = horas_trabajadas * 20000;
    JOptionPane.showMessageDialog(null, "Su salario es: "+operacion+ " pesos");
        
    }
else{
    operacion =  horas_trabajadas * 16000;
    JOptionPane.showMessageDialog(null, "Su salario es: "+operacion+" pesos");
}
    
    
    
    
    
    }
    
}
