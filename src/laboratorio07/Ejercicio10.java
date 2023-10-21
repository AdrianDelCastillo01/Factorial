package laboratorio07;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un numero entero positivo (a): ");
        int a = Integer.parseInt(scan.nextLine());
        System.out.print("Ingrese otro numero entero positivo (b): ");
        int b = Integer.parseInt(scan.nextLine());
        int mcm = 1;
        //mientras que A o B sean mayorres que 1
        for (int i = 2; a > 1 || b > 1; i++) {
            //Si alguno de ellos puede dividirse entre un numero que no sea 1
            if (a % i == 0 || b % i == 0) {
                //Si a puede dividirse entre i
                if (a % i == 0) a /= i;
                //Si b puede dividirse entre i
                if (b % i == 0) b /= i;
                mcm *= i;
                //Intentar dividir entre 2, ya que entre 1 siempre se va a poder
                i = 2; 
            }
        }
        System.out.println("Su minimo comun multiplo es " + mcm);
    }
}
