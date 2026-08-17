import java.util.Scanner;
public class estacionamientocargo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce numero de horas: ");
        double h = scanner.nextDouble();
        CargoAuto(h);
        scanner.close();
    }
    public static void CargoAuto(double h) {
        if (h <= 0) {
            System.out.print("Cargo total = 0.00");
            return;
        }
        double cargo = 3.00;
        if (h > 1) {
            cargo += (h - 1) * 0.50;
        }
        if (cargo > 12.00) {
            cargo = 12.00;
        }
        double total = (cargo * 100.0) / 100.0;
        System.out.print("Cargo total = " + total);
    }
}
