import java.util.Scanner;

public class TemperaturaLoja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit;

        System.out.print("Ingrese la temperatura en Celsius: ");
        celsius = sc.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura Fahrenheit: " + fahrenheit);

        if (celsius < 15) {
            System.out.println("Temperatura fria");
        } else if (celsius <= 24) {
            System.out.println("Temperatura templada");
        } else {
            System.out.println("Temperatura calida");
        }

        sc.close();
    }
}
