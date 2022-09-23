package test;

import java.util.Scanner;

/* Memento Mori
*
* alt+fleche haut+f = belle présentation
*
*
 */
/**
 *
 * @author kazekage
 */
public class test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(".________________.");
        System.out.println("| Welcome user   |");
        System.out.println("|________________|");
        System.out.println("Entrez la valeur minimale de la liste :");
        int min = scanner.nextInt();
        System.out.println("Entrez la valeur maximale de la liste :");
        int max = scanner.nextInt();
        System.out.println("Vous avez sélectionnez comme valeur minimale: " + min + " et comme valeur maximale: " + max);
        afficheresultat(min, max);

    }

    public static void afficheresultat(int min, int max) {

        for (int n = min; n <= max; n++) {
            boolean divisible3 = divisible3(n);
            boolean divisible5 = divisible5(n);

            // si nombre divisible par 3, afficher Fizz
            if (divisible3 == true) {
                System.out.println("Fizz");
            } //si nombre divisible par 5, afficher Buzz
            else if (divisible5 == true) {
                System.out.println("Buzz");
            } //si nombre divisible par 3 et 5, afficher Fizzbuzz
            else if (divisible3 && divisible5) {
                System.out.println("FizzBuzz");
            } else if (!divisible3 || !divisible5 && !divisible3 && !divisible5) {
                System.out.println(n);
            }

        }
    }

    /*
    * Booléen vérifiant si un nombre est divisible par 3
     */
    public static boolean divisible3(int nombre) {
        if( nombre % 3 == 0 )return true;
        return false;
    }

    /*
    * Booléen vérifiant si un nombre est divisible par 5
    *
     */
    public static boolean divisible5(int nombre) {
        if (nombre % 5 == 0) return true;
        return false;
    }

}