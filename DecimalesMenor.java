import java.util.Scanner;
public class DecimalesMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Introduce el segundo número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Introduce el tercer número: ");
        double n3 = scanner.nextDouble();
        double resultado = decimalMenor(n1, n2, n3);
        System.out.print("El numero decimal menor es = " + resultado);
        scanner.close();
    }
    public static double decimalMenor (double a, double b, double c) {
        double min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
