package laboratorio07;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("¿Cuantos numeros desea ingresar?: ");
        int i = Integer.parseInt(scan.nextLine());
        int mult5 = 0, mult2 = 0, actual;
        while (i > 0) {
            System.out.print("Ingrese un numero: ");
            actual = Integer.parseInt(scan.nextLine());
            if (actual % 2 == 0 && actual != 0) mult2++;
            if (actual % 5 == 0 && actual != 0) mult5++;
            i--;
        }
        System.out.println("La cantidad de multiplos de 2 es: " + mult2);
        System.out.println("El cantidad de multiplos de 5 es: " + mult5);
    }
}
