import java.util.Scanner;

public class EjemploDoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i = 0;
        int contador;
        System.out.println("introduce un numero : ");
        contador = s.nextInt();

        do {
            System.out.println(i);
            i +=3;
        }while (i<contador);
    }
}
