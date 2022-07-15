
package javaapplication34;

import javax.swing.JOptionPane;

public class JavaApplication34 {

    public static void main(String[] args) {
int n1 = 0,n2= 0,n3= 0;
n1= Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
n2= Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
n3= Integer.parseInt(JOptionPane.showInputDialog("Digite el tercer numero"));

if(n1 > n2){
    
    if(n2 > n3){
        JOptionPane.showMessageDialog(null, "  El orden es: "+n1+" "+n2+" "+n3);
    }
    else{
        JOptionPane.showMessageDialog(null, "  El orden es: "+n1+" "+n3+" "+n2);
    }
}
else if(n2 > n1){
      if(n1 > n3){
        JOptionPane.showMessageDialog(null, "  El orden es: "+n2+" "+n1+" "+n3);
    }
    else{
        JOptionPane.showMessageDialog(null, "  El orden es: "+n2+" "+n3+" "+n1);
    }
}
else if( n3 > n1){
    if(n1 > n2){
        JOptionPane.showMessageDialog(null, "  El orden es: "+n3+" "+n2+" "+n1);
    }
    else{
        JOptionPane.showMessageDialog(null, "  El orden es: "+n3+" "+n1+" "+n2);
    }
}
else{
    
}
    
    
    
    
    
    }
    
}
