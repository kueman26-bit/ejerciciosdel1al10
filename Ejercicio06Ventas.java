import java.util.Scanner;

public class Ejercicio06Ventas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto de ventas: S/ ");
        double ventas = sc.nextDouble();

        double porcentaje;

        if (ventas > 5000) {
            porcentaje = 0.10;
        } else {
            porcentaje = 0.05;
        }

        double bonificacion = ventas * porcentaje;
        double total = ventas + bonificacion;

        System.out.println("Bonificacion: S/ " + bonificacion);
        System.out.println("Total: S/ " + total);

        sc.close();
    }
}