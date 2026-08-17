import java.util.Random;

public class SimulacionDado {
    public static void main(String[] args) {
        int totalLanzamientos = 20_000;
        int[] frecuencias = new int[6]; 
        Random random = new Random();

        for (int i = 0; i < totalLanzamientos; i++) {
            int resultado = random.nextInt(6);
            frecuencias[resultado]++;           
        }

        System.out.println("Resultados tras " + totalLanzamientos + " lanzamientos:");
        for (int i = 0; i < frecuencias.length; i++) {
            int cara = i + 1;
            double porcentaje = (frecuencias[i] / (double) totalLanzamientos) * 100;
            System.out.printf("Cara %d: %d veces (%.2f%%)%n", cara, frecuencias[i], porcentaje);
        }
    }
}