import java.util.Scanner;

public class DecimalBinario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero decimal: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Ingrese un numero positivo");
        } else if (numero == 0) {
            System.out.println("Binario: 0");
        } else {

            String binario = "";

            while (numero > 0) {
                int residuo = numero % 2;
                binario = residuo + binario;
                numero = numero / 2;
            }

            System.out.println("Numero binario: " + binario);
        }

        sc.close();
    }
}
