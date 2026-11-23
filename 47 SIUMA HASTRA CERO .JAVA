import java.util.Scanner;

public class HastaCero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma = suma + numero;

            System.out.print("Ingrese otro numero: ");
            numero = sc.nextInt();
        }

        System.out.println("La suma es: " + suma);

        sc.close();
    }
}
