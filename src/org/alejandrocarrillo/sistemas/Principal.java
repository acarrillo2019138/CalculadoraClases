
package org.alejandrocarrillo.sistemas;
import javax.swing.JOptionPane;
import org.alejandrocarrillo.bean.Division;
import org.alejandrocarrillo.bean.Multiplicacion;
import org.alejandrocarrillo.bean.Resta;
import org.alejandrocarrillo.bean.Sumar;


public class Principal {

    public static void main(String[] args) {
        Sumar s = new Sumar(0,0);
        Resta r = new Resta(0,0);
        Multiplicacion m =new Multiplicacion(0,0);
        Division d = new Division(0,0);
        JOptionPane.showMessageDialog(null,"Calculadora");
        int operaciones = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero de opcion \n"
       + "1. Sumar \n"
       + "2. Resta \n"
       + "3. Muliplicacion \n"
       + "4. Division\n"
       + "5. Salir " ,"Menu Principal",JOptionPane.WARNING_MESSAGE));
        
        switch (operaciones){
            case 1:
                s.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero")));
                s.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo numero")));
                JOptionPane.showMessageDialog(null,"El resultado es : " + s.Sumatoria(s.getValor1(),s.getValor2()));
            break;
            case 2:
                r.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer numero")));
                r.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null, "El resultado es : "+ r.Restaa(r.getValor1(), r.getValor2()));
            break;
            case 3:
                m.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer valor")));
                m.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null,"El resultado es : " + m.Multi(m.getValor1(), m.getValor2()));
            break;
            case 4:
                d.setValor1(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer valor")));
                d.setValor2(Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo valor")));
                JOptionPane.showMessageDialog(null,"El resultado es : "+ d.Divi(d.getValor1(), d.getValor2()));
             break;
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }
}