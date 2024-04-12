package Resistencia;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Resistencia {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            float resistenciaUno, resistenciaDos, resistenciaTres;
            System.out.println("Ingrese resistencia 1: ");
            resistenciaUno = sc.nextFloat();
            System.out.println("Ingrese resistencia 2: ");
            resistenciaDos = sc.nextFloat();
            System.out.println("Ingrese resistencia 3");
            resistenciaTres = sc.nextFloat();

            if (resistenciaUno == 0 || resistenciaDos == 0 || resistenciaTres == 0) {
                System.out.println("Error");
            } else {
                Double resistenciaTotal = 1 / (1.0 / resistenciaTres + 1.0 / resistenciaDos + 1.0 / resistenciaTres);
                System.out.println("La resistencia total es: " + resistenciaTotal);


            }

        }};