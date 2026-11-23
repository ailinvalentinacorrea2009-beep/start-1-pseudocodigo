import java.util.Scanner;

public class SumaNaturales {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero >= 1) {

            for (int i = 1; i <= numero; i++) {
                suma = suma + i;
            }

            System.out.println("La suma es: " + suma);

        } else {
            System.out.println("Ingrese un numero positivo");
        }

        sc.close();
    }
}
