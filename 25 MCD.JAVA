import java.util.Scanner;

public class MCD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, residuo;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        int x = a;
        int y = b;

        while (y != 0) {
            residuo = x % y;
            x = y;
            y = residuo;
        }

        System.out.println("El MCD es: " + x);

        sc.close();
    }
}
