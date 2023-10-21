package laboratorio07;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sumatoria = 0, actual;
        int cantidad = 0;
        do {
            System.out.print("Ingrese un numero: ");
            actual = Double.parseDouble(scan.nextLine());
            sumatoria += actual;
            cantidad++;
        } while (actual != 0);
        cantidad--; //Quitarle 1 a la cuenta para que no cuente el 0
        sumatoria /= cantidad;
        System.out.println("El promedio de los numeros es: " + sumatoria);
    }
}
