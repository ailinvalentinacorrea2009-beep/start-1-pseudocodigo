import java.util.Scanner;

public class DecimalHexadecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero decimal: ");
        numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("Ingrese un numero positivo");
        } else {
            String hexadecimal = "";

            if (numero == 0) {
                hexadecimal = "0";
            }

            while (numero > 0) {
                int residuo = numero % 16;

                if (residuo < 10) {
                    hexadecimal = residuo + hexadecimal;
                } else {
                    hexadecimal = (char)('A' + residuo - 10) + hexadecimal;
                }

                numero = numero / 16;
            }

            System.out.println("Hexadecimal: " + hexadecimal);
        }

        sc.close();
    }
}
