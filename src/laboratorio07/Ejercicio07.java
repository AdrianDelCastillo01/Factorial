package laboratorio07;

public class Ejercicio07 {

    public static void main(String[] args) {
        int numero = 456, conteo = 0;
        do {
            conteo += numero;
            numero += 2;
        } while (numero <= 800);
        System.out.println("La suma de los pares de 456 a 800 es " + conteo);
    }
}
