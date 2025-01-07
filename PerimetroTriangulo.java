/**
 *
 * @author Nirmin
 */
import java.util.Scanner;

public class PerimetroTriangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la longitud del lado 1:");
        double lado1 = scanner.nextDouble();

        System.out.println("Ingresa la longitud del lado 2:");
        double lado2 = scanner.nextDouble();

        System.out.println("Ingresa la longitud del lado 3:");
        double lado3 = scanner.nextDouble();

        // Llamada a la función corregida
        double perimetro = calcularPerimetro(lado1, lado2, lado3);

        System.out.println("El perímetro del triángulo es: " + perimetro);

        scanner.close();
    }

    // Función con nombre corregido
    public static double calcularPerimetro(double lado1, double lado2, double lado3) {
        // Corregir la fórmula del perímetro (eliminar la división por 3)
        return lado1 + lado2 + lado3;
    }
}
