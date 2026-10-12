import java.util.Scanner;

public class Ejercicio07Peso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = sc.nextDouble();

        if (peso <= 50) {
            System.out.println("Paquete aceptado");
        } else {
            double exceso = peso - 50;
            System.out.println("Paquete rechazado");
            System.out.println("Kilos que sobrepasa: " + exceso);
        }

        sc.close();
    }
}