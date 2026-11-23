import java.util.Scanner;

public class EstadisticasNotas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, promedio, mayor, menor;

        System.out.print("Ingrese la primera nota: ");
        n1 = sc.nextDouble();

        System.out.print("Ingrese la segunda nota: ");
        n2 = sc.nextDouble();

        System.out.print("Ingrese la tercera nota: ");
        n3 = sc.nextDouble();

        promedio = (n1 + n2 + n3) / 3;

        mayor = Math.max(n1, Math.max(n2, n3));
        menor = Math.min(n1, Math.min(n2, n3));

        System.out.println("Promedio: " + promedio);
        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);

        sc.close();
    }
}
