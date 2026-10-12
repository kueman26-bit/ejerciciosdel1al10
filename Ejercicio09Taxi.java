import java.util.Scanner;

public class Ejercicio09Taxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese los kilometros recorridos: ");
        double km = sc.nextDouble();

        double total;

        if (km <= 3) {
            total = 8;
        } else {
            total = 8 + (km - 3) * 2.50;
        }

        System.out.println("Tarifa total: S/ " + total);
        sc.close();
    }
}