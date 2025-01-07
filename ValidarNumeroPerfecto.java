/**
 *
 * @author Nirmin
 */
import java.util.ArrayList;
import java.util.List;

public class ValidarNumeroPerfecto {

    public static void main(String[] args) {
        // Ejemplo de uso
        int numero = 28;

        if (esNumeroPerfecto(numero)) {
            System.out.println(numero + " es un número perfecto.");
        } else {
            System.out.println(numero + " no es un número perfecto.");
        }
    }

    // Función 1: Verificar si un número es perfecto
    public static boolean esNumeroPerfecto(int numero) {
        return sumaDivisoresPropios(numero) == numero;
    }

    // Función 2: Calcular la suma de los divisores propios de un número
    public static int sumaDivisoresPropios(int numero) {
    int suma = 1; 

    for (int i = 2; i <= numero / 2; i++) {
        if (numero % i == 0) {
            suma += i;
        }
    }

    return suma;
}

    // Funcion 3: Generar los primeros n números perfectos
   public static int encontrarNumeroPerfecto(int numero) {
         int candidato = numero + 1;

        while (true) {
            int sumaDivisores = sumaDivisoresPropios(candidato);

            if (sumaDivisores == candidato) {
                return candidato;
            }
            candidato++;
        }
    }
    // Función 4: Verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Función 5: Calcular el factorial de un número
    public static long factorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
             return numero * factorial(numero - 1);
        }
    }

    
}