package factorial;

public class Factorial {

    private static int LLEVA = 0;

    public static void main(String[] args) {
        int factorial = 1;
        String almacen = "1";
        while (factorial <= 100) {
            almacen = multiplicar(almacen,String.valueOf(factorial));
            factorial++;
        }
        System.out.println(almacen);
    }

    //factor1 es el numero original y factor2 el numero por el que se multiplica
    private static String multiplicar(String num1, String num2) { //supongamos  ingresa un 362880 y un 10

        String retornar = "";

        //Crea los sumandos
        String sumando1 = "-1", sumando2 = "0";

        int espaciado = 0;
        for (int i = 1; i <= num2.length(); i++) {
            //Variable temporal para guardar los datos recientemente sumados
            String temp = "";

            //Crea el factor 2
            int factor2 = Integer.parseInt(String.valueOf(num2.charAt(num2.length() - i))); // Obtiene un caracter contando de derecha a izquierda

            for (int j = 1; j <= num1.length(); j++) {

                //Crea el factor 1
                int factor1 = Integer.parseInt(String.valueOf(num1.charAt(num1.length() - j))); //Obtiene un caracter contando de derecha a izquierda

                //Obtiene un nuevo numero mas a la izquierda.
                int s = obtenerUnidades(factor1, factor2);

                temp = s + temp;
            }

            //Al finalizar, coloca el ultimo dato llevado, para no perder su valor (en 6*4, se podria perder el 2 de 24)
            if (LLEVA != 0) {
                temp = LLEVA + temp;
            }
            //Reinicia el almacen
            LLEVA = 0;

            //Si el sumando 1 esta vacio, guarda el dato ahi.
            if (sumando1.equals("-1")) {
                sumando1 = temp;
            } else { //De lo contrario, lo guarda en el sumando 2
                sumando2 = temp;
            }
            //Actualiza el retornar, siguiendo el sumador
            sumando1 = sumador(sumando1, sumando2, espaciado);
            retornar = sumando1;
            //Asi sabes que cambiaste de linea al finalizar con uno de los numeros del multiplicador.
            espaciado++;
        }

        return retornar;

    }

    //Obtiene las unidades y guarda lo que se esta llevando para la siguiente operacion.
    private static int obtenerUnidades(int num1, int num2) {
        int multi = num1 * num2 + LLEVA;
        LLEVA = multi / 10;
        return multi % 10;
    }

    //el sumando1 es el sin espaciados
    private static String sumador(String sumando1, String sumando2, int espaciado) {
        int lleva = 0;
        String resultado = "";

        for (; espaciado > 0; espaciado--) {
            sumando2 = sumando2 + "0";
        }

        int suma, sum1, sum2;

        //Si el 1er sumando tiene menos caracteres que el 2do, añadirle 0 a la izquierda
        while (sumando2.length() > sumando1.length()) {
            sumando1 = "0" + sumando1;
        } //Lo mismo con sumando2
        while (sumando1.length() > sumando2.length()) {
            sumando2 = "0" + sumando2;
        }

        for (int i = 1; i <= sumando1.length(); i++) {

            //Obtiene el primer sumando
            sum1 = Integer.parseInt(String.valueOf(sumando1.charAt(sumando1.length() - i)));

            sum2 = Integer.parseInt(String.valueOf(sumando2.charAt(sumando2.length() - i)));

            //NO OLVIDAR LO QUE SE LLEVA
            suma = sum1 + sum2 + lleva;
            lleva = suma / 10; //Guardar lo que se lleva
            suma = suma % 10;
            resultado = suma + resultado;
        }

        //Si el ultimo dato llevado no es 0, se coloca, por ejemplo 5+7 = 12, se podria perder el 1
        if (lleva != 0) {
            resultado = lleva + resultado;
        }
        return resultado;
    }
}