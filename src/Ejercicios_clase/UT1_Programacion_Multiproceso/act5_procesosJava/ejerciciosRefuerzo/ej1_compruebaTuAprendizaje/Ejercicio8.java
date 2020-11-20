package Ejercicios_clase.UT1_Programacion_Multiproceso.act5_procesosJava.ejerciciosRefuerzo.ej1_compruebaTuAprendizaje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {



        try {
            File file = new File("C:/Users/Vic/Desktop/DAM/PSP/1º EV/psp-2021/psp-2021/src/Ejercicios_clase/ejerciciosRefuerzo/compruebaTuAprendizaje/input.txt");
            Scanner sc = new Scanner(file);

            while(sc.hasNext()) {
                String input = sc.nextLine();
                String res = "";

                for (int i = input.length() - 1; i >= 0; i--)
                    res = res + input.charAt(i);

                sc.close();

                if (input.equals(null) || input.equals("")) {

                    System.out.println("Cadena vacia");

                } else if (input.equals(res)) {
                    System.out.println("Es palindromo");
                } else {
                    System.out.println("No es palindromo");
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
