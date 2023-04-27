import java.util.Scanner;

public class DesplazamientoArray {
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        System.out.println("Ingresa 10 numero: ");
        int [] numero = new int [10]; // Creamos el array con 10 elementos enteros.
        int ultimo;

        for (int i = 0;i < 10; i++){
            System.out.print(i + " .digite el arreglo: ");
            numero[i] = s.nextInt();
        }
        ultimo = numero[9]; // Guardamos el último elemento.

        for (int i = 8; i > 0 ; i--){ //Avanzamos una posicion en el array
            numero[i + 1] = numero[i];
        }
        numero[0] = ultimo; //Ponemos el ultimo elemento como primero

        System.out.println("El nuevo array es : ");
        for (int i = 0; i< 10; i++){
            System.out.println(i + " numero: " + numero[i]);
        }
    }
}
