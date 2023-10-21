package laboratorio07;

import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cantidad = 0;
        double actual;
        do {
            System.out.print("Ingrese un numero: ");
            actual = Double.parseDouble(scan.nextLine());
            if (actual > 0) cantidad++;
        } while (actual != 0);
        System.out.println("La cantidad de positivos es: " + cantidad);
    }
}
