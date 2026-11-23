import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }

        sc.close();
    }
}
