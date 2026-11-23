import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        if (a > b) {
            System.out.println("El mayor es: " + a);
        } else if (b > a) {
            System.out.println("El mayor es: " + b);
        } else {
            System.out.println("Los numeros son iguales");
        }

        sc.close();
    }
}
