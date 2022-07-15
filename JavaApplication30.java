package javaapplication30;

import javax.swing.JOptionPane;

public class JavaApplication30 {
    public static void main(String[] args) {
        float valor_compra = Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de su compra"));
        float total_pagar = 0; total_pagar =  valor_compra;
        
        if(valor_compra >= 300){
            total_pagar *= 0.20; // total_pagar = total_pagar * 0.20;
            valor_compra -= total_pagar; // valor_compra = valor_compra - total_pagar;
            JOptionPane.showMessageDialog(null, "El total a pagar es: "+valor_compra);
        }
        else{
           JOptionPane.showMessageDialog(null, "El total a pagar es: "+valor_compra);
        }
    }
    
}
