import javax.swing.*;

public class CuadradoNumero {
    public static void main(String[] args) {

        int numero,cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("mete un numero: "));

        while(numero >= 0){
            System.out.println();
            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null, "El numero " + numero + " elevado al cuadrado es: " + cuadrado);
            //System.out.println("El cuadrado es :" + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("mete un numero: "));
        }
    }
}
