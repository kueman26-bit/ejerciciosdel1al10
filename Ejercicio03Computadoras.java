import java.util.Scanner;

public class Ejercicio03Computadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de computadoras: ");
        int cantidad = sc.nextInt();

        double subtotal = cantidad * 2500;
        double descuento;

        if (cantidad >= 5) {
            descuento = subtotal * 0.12;
        } else {
            descuento = subtotal * 0.05;
        }

        double total = subtotal - descuento;

        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("Descuento: S/ " + descuento);
        System.out.println("Total a pagar: S/ " + total);

        sc.close();
    }
}