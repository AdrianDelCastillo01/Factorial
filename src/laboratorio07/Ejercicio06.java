package laboratorio07;

import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = (int) (Math.random() * (100) + 1);
        int actual, intentos = 0;
        do {
            System.out.print("Ingrese un numero entre 1 y 100: ");
            actual = Integer.parseInt(scan.nextLine());
            if (actual > numero) {
                System.out.println("Te pasaste, prueba un numero mas bajo.");
            } else if(actual < numero){
                System.out.println("Aun te falta, prueba un numero mas alto.");
            }
            intentos++;
        } while (actual != numero);
        System.out.println("Acertaste!! El numero secreto era " + numero);
        System.out.println("Tuviste " + intentos + " intentos");
    }
}
