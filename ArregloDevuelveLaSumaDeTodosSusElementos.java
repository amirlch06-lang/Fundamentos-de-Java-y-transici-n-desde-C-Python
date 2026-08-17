public class SumaArreglo {
    public static int sumarArreglo(int[] arreglo) {
        int suma = 0;
        for (int elemento : arreglo) {
            suma += elemento;
        }
        return suma;
    }

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Suma en Java: " + sumarArreglo(numeros));
    }
}