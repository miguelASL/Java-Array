import javax.swing.*;

public class PositivoNegativo {
    public static void main(String[] args) {

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce3" +
                " el numero : "));

        while(numero > 0){
            JOptionPane.showMessageDialog(null, "El numero es positivo");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero : "));
        }if( numero < 0) {
            JOptionPane.showMessageDialog(null, "El numero es negativo");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero : "));
        }
    }
}
