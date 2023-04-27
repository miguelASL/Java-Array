import java.util.Scanner;

public class AgruparParImpar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] a = new int[10]; // Creamos el array para 10 elementos enteros
        int conteo_par = 0;
        int conteo_impar = 0;

        System.out.println(" LLenar el array: ");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " .digito : ");
            a[i] = s.nextInt();

            if (a[i] % 2 == 0) { //Si el numero es par
                conteo_par++;
            } else { // Si el numero es impar
                conteo_impar++;
            }
        }
        conteo_par = 0; // Es como si fuera el iterador "i".
        conteo_impar = 0; // Es como si fuera el iterador "j".
        int[] par = new int[conteo_par];
        int[] impar = new int[conteo_impar];

        // Almacenamos los numeros pares en su array y los impares tambien.
        for (int i = 0; i < 10; i++) {
            if (a[i] % 2 == 0) {
                par[conteo_par] = a[i];
                conteo_par++;
            } else {
                impar[conteo_impar] = a[i];
                conteo_impar++;
            }
        }

        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < conteo_par; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println("");

        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < conteo_impar; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");
    }
}