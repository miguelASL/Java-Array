import java.util.Scanner;

public class CantidadPositivos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador = 0;
        int numero;

        do {
            System.out.println("Introduce un numero: ");
            numero = s.nextInt();
            contador++;
        } while (numero >= 0);
        System.out.println("Se ha introducido " + (contador -1) + " numeros ");
    }
}