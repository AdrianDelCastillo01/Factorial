package laboratorio07;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo: ");
        String numero = scan.nextLine();
        int almacen;
        do {
            //Reinicia el almacen
            almacen = 0;
            for (int i = 0; i < numero.length(); i++) {
                //Debe ser charAt + "" para que recoja el numero y no su valor ASCII
                almacen += Integer.valueOf(numero.charAt(i) + "");
            }
            numero = String.valueOf(almacen);
        } while (almacen > 9);
        if (almacen == 9) System.out.println("Es multiplo de 9");
        else System.out.println("No es multiplo de 9");
    }
}
