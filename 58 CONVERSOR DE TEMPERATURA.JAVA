import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Ingrese grados Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Grados Fahrenheit: " + fahrenheit);

        sc.close();
    }
}
