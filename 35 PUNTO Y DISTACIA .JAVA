import java.util.Scanner;

public class PuntoMedioDistancia {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x1, y1, x2, y2;
        double pmx, pmy, distancia;

        System.out.print("Ingrese x1: ");
        x1 = sc.nextDouble();

        System.out.print("Ingrese y1: ");
        y1 = sc.nextDouble();

        System.out.print("Ingrese x2: ");
        x2 = sc.nextDouble();

        System.out.print("Ingrese y2: ");
        y2 = sc.nextDouble();

        pmx = (x1 + x2) / 2;
        pmy = (y1 + y2) / 2;

        distancia = Math.sqrt(
            Math.pow(x2 - x1, 2) +
            Math.pow(y2 - y1, 2)
        );

        System.out.println("Punto medio: (" + pmx + ", " + pmy + ")");
        System.out.println("Distancia: " + distancia);

        sc.close();
    }
}
