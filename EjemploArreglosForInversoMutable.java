import java.util.Arrays;

public class EjemploArreglosForInversoMutable {

    public static void arregloInverso(String[] arreglo){
        int total2 = arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total/2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total - 1 - i];
            arreglo[i] = inverso;
            arreglo[total - 1 - i] = actual;
            total2--;
        }
    }
    public static void main(String[] args){

            String[] productos = {"Kingston Pendrive 64GB", "Samsung Galaxy", "Disco Duro SSD Samsung Externo",
                    "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford"};

            int total = productos.length;

            Arrays.sort((productos));
            arregloInverso(productos); // Si comentas este método, lo ordena de forma ascendente.

            System.out.println("=== Usando for ===");
            for (int i = 0; i < total; i++) {
                System.out.println("Para indice  = " + i + " : " + productos[i]);
            }
        }
}