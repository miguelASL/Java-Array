import java.util.Arrays;
import java.util.Scanner;

public class EjercicioArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce los numeros: ");
        int [] numeros = new int[5];
        numeros[0] = s.nextInt();
        numeros[1] = s.nextInt();
        numeros[2] = s.nextInt();
        numeros[3] = s.nextInt();
        numeros[4] = s.nextInt();

        for (int i : numeros) {
            System.out.println(i);
        }
    }
}
