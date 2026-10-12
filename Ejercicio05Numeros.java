import java.util.Scanner;

public class Ejercicio05Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double c = sc.nextDouble();

        double mayor = Math.max(a, Math.max(b, c));
        double menor = Math.min(a, Math.min(b, c));
        double diferencia = mayor - menor;

        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Diferencia: " + diferencia);

        sc.close();
    }
}