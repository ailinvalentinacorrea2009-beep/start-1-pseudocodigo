import java.util.Scanner;

public class NumerosPerfectos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero, suma = 0;

        System.out.print("Ingrese un numero: ");
        numero = sc.nextInt();

        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                suma = suma + i;
            }
        }

        if (numero > 1 && suma == numero) {
            System.out.println("Es un numero perfecto");
        } else {
            System.out.println("No es un numero perfecto");
        }

        sc.close();
    }
}
