import java.util.Scanner;

public class CompararOrdenArrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [] a = new int [10];
        boolean creciente = false, decreciente = false;


        for (int i = 0; i < 10; i++){
            System.out.println("Dame un numero: ");
            a[i] = s.nextInt();
        }
        for (int i = 0; i < 9; i++) {
            if (a[i] < a[i + 1]) {
                creciente = true;
            }
            if (a[i] > a[i + 1]) {
                decreciente = true;
            }
        }
        if (creciente == true && decreciente == false){
            System.out.println("\nEl array esta en forma creciente");
        }
        else if (creciente == false && decreciente == true) {
            System.out.println("\nEl array esta en forma decreciente");
        }
        else if (creciente == true && decreciente == true) {
            System.out.println("\nEl array esta desordenado");
        } else if (creciente == false && decreciente == false) {
            System.out.println("\nTodos los elementos son iguales");
        }
    }
}
