import java.util.Scanner;

public class Ejercicio04Electricidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el consumo en kWh: ");
        double consumo = sc.nextDouble();

        double total;

        if (consumo <= 100) {
            total = consumo * 0.80;
        } else {
            total = consumo * 1.20;
        }

        System.out.println("Monto a pagar: S/ " + total);
        sc.close();
    }
}