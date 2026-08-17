import java.util.Scanner;

public class ArregloAscendente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Ingresa 10 números estrictamente crecientes:");

        for (int i = 0; i < numeros.length; i++) {
            boolean valido = false;

            while (!valido) {
                System.out.print("Ingrese el número para la posición [" + i + "]: ");
                int numeroIngresado = scanner.nextInt();

                if (i == 0 || numeroIngresado > numeros[i - 1]) {
                    numeros[i] = numeroIngresado;
                    valido = true;
                } else {
                    System.out.println(" Error: El número debe ser estrictamente MAYOR que " + numeros[i - 1] + ". Intenta de nuevo.");
                }
            }
        }

        System.out.println("\nArreglo guardado correctamente:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición [" + i + "]: " + numeros[i]);
        }

        scanner.close();
    }
}