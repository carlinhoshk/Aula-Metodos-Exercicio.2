package one.digitalinnovation.basecamp;
/*
    17:44
    23/04/2022
    exercicio 2 metodos
 */

public class Quadrilatero {

    public static void area(double lado) {

        System.out.println("Área do quadrado:" + lado * lado);

    }

    public static void area(double lado1, double lado2) {

        System.out.println("Área do retangulo:" + lado1 * lado2);

    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Àrea do trapezio:" + ((baseMaior+baseMenor)*altura) / 2);

    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Área do losangulo:" + (diagonal1 * diagonal2) /2);

    }
}
