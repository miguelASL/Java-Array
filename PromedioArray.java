import java.util.Arrays;
import java.util.Scanner;

public class PromedioArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float [] numeros = new float[5];
        float suma_positivos = 0, suma_negativos = 0, media_positivos, media_negativos;
        int conteo_positivo = 0, conteo_negativo = 0, conteo_ceros = 0;

        System.out.println("Guardando los numeros en el array");
        for (int i = 0; i <5; i++) {
            System.out.println((i + 1) + ". Digite un numero: ");
            numeros[i] = s.nextFloat();

            if (numeros[i] == 0) {
                conteo_ceros++;
            } else if (numeros[i] > 0) {
                suma_positivos += numeros[i];
                conteo_positivo++;
            } else if (numeros[i] < 0) {
                suma_negativos += numeros[i];
                conteo_negativo++;
            }
        }
        if (suma_positivos == 0) {
            System.out.println("No se puede sacar la media");
        } else {
            media_positivos = suma_positivos / conteo_positivo;
            System.out.println("media_positivos = " + media_positivos);
        }
        if (suma_negativos == 0) {
            System.out.println("No se puede sacar la media");
        } else {
            media_negativos = suma_negativos / conteo_negativo;
            System.out.println("media_negativos = " + media_negativos);
        }
        System.out.println("conteo_ceros = " + conteo_ceros);

    }
}
