import java.util.Scanner;

public class numerosEnteros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número1: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el número2: ");
        int numero2 = scanner.nextInt();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int multiplicacion = n1 * n2;
        double division = (double) n1 / n2;

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + division);

        scanner.close();
    }
}