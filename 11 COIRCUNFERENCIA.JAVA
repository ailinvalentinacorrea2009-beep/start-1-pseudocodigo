
import java.util.Scanner;

public class Circunferencia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radio, longitud, area;

        System.out.print("Ingrese el radio: ");
        radio = sc.nextDouble();

        longitud = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;

        System.out.println("Longitud: " + longitud);
        System.out.println("Area: " + area);

        sc.close();
    }
}
