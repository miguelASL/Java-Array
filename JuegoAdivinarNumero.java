import javax.swing.*;

public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        int numero, azar;
        int contador = 0;

        azar = (int) (Math.random() * 10); //Generamos un numero del 0 - 100

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero : "));

            if (azar > numero) {
                System.out.println("Di un numero mayor");
            }
            else {
                System.out.println("Di un numero menor");
            }
            contador++;
        } while (numero != azar);
        System.out.println("\nGreat !!! Adivinaste el numero en " + contador + " intentos");
    }
}
