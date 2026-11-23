import java.util.Scanner;

public class MenorTresNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, menor;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        c = sc.nextInt();

        menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        System.out.println("El menor es: " + menor);

        sc.close();
    }
}
