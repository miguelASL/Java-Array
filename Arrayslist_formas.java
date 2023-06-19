package ejercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Arrayslist_formas {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
        for (Integer x: list) {
            if (x % 2 ==0){
                System.out.println("El numero " + x + " es par" );
            }else {
                System.out.println("El numero " + x + " es impar" );
            }
        }
    }
}
