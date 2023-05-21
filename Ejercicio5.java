import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int number = input.nextInt();

        long factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }

    public static long calcularFactorial(int n) {
        if (n < 0) {
            throw new Error ("El número debe ser no negativo.");
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}