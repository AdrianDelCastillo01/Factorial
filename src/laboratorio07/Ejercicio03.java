package laboratorio07;

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mayores = 0, menores = 0, actual;
        int contMayor = 0, contMenor = 0;
        do {
            System.out.print("Ingrese un numero: ");
            actual = Double.parseDouble(scan.nextLine());
            if (actual > 500) {
                mayores += actual;
                contMayor++;
            } else if (actual < 500 && actual != 0) {
                menores += actual;
                contMenor++;
            }
        } while (actual != 0);
        mayores /= contMayor;
        menores /= contMenor;
        System.out.println("El promedio de los numeros mayores a 500 es: " + mayores);
        System.out.println("El promedio de los numeros menores a 500 es: " + menores);
    }
}
