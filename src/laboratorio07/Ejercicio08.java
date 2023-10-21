package laboratorio07;

import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        int dividendo = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese el divisor: ");
        int divisor = Integer.parseInt(scan.nextLine());
        while (dividendo >= divisor) {
            dividendo -= divisor;
        }
        System.out.println("El residuo es de " + dividendo);
    }
}
