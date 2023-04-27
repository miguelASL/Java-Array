import java.util.Scanner;

public class UnirArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int [] a = new int[10]; // Array con 10 elementos.
        int [] b = new int [10]; // Array con 10 elementos.
        int [] c = new int [20]; // Array con 20 elementos.

        // Pedimos el arreglo a.
        System.out.println("Digite el primer array: ");
        for (int i = 0; i< 10; i++){
            System.out.println((i + 1)+ ".Digite un numero: ");
            a[i] = s.nextInt();
        }
        // Pedimos el arreglo b.
        System.out.println("\nDigite el primer array: ");
        for (int i = 0; i< 10; i++){
            System.out.println((i + 1)+ ".Digite un numero: ");
            b[i] = s.nextInt();
        }
        // Ahora vamos a mezclar los 2 arrays en el array c.
        int j = 0;
        for (int i = 0; i < 10; i++){
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }
        System.out.println("\nEl tercer array es: " + c);
        for (int i = 0; i < 20; i++){
            System.out.println(c[i] + " ");
        }
        System.out.println();
    }
}
