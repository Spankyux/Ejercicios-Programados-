import java.util.Scanner;

public class CalcularAP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        double radio = scanner.nextDouble();

        double area = calcularA(radio);
        double perimetro = calcularP(radio);

        System.out.println("El área es: " + area);
        System.out.println("El perímetro es: " + perimetro);
    }
    public static double calcularA(double radio) {
        return Math.PI * radio * radio;
    }

    public static double calcularP(double radio) {
        return 2 * Math.PI * radio;
    }
}  