import java.util.Scanner; 
public class ConversionSeg { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Introduce numero de horas: "); 
        int n1 = scanner.nextInt(); 
        System.out.print("Introduce numero de minutos: "); 
        int n2 = scanner.nextInt(); 
        System.out.print("Introduce numero de segundos: "); 
        int n3 = scanner.nextInt(); 
        int seg = (n1 * 3600) + (n2 * 60) + n3; 
        System.out.print("Segundos totales = " + seg); 
        scanner.close(); 
    } 
} 