import java.util.Scanner;

public class Ejercicio02Prestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su sueldo mensual: S/ ");
        double sueldo = sc.nextDouble();

        double prestamo;

        if (sueldo >= 3000) {
            prestamo = sueldo * 5;
        } else {
            prestamo = sueldo * 2;
        }

        System.out.println("Prestamo maximo: S/ " + prestamo);
        sc.close();
    }
}