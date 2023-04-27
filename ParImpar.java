import javax.swing.*;

public class ParImpar {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
        while (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
        }if (numero % 2 == 1){
            JOptionPane.showMessageDialog(null, "Es impar");
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero"));
        }
    }
}
