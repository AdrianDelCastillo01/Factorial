package laboratorio07;

public class Ejercicio01 {

    public static void main(String[] args) {
        int suma = 0;
        int impar = 1;
        //100*2 = 200, los 100 primeros impares siempre seran menores a 500.
        for (int i = 0; i < 100; i++) {
            suma += impar;
            impar += 2;
        }
        System.out.println("La suma es: " + suma);
    }
}
