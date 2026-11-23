import java.util.Scanner;

public class IncrementoSalario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salario, porcentaje, incremento, nuevoSalario;

        System.out.print("Ingrese el salario actual: ");
        salario = sc.nextDouble();

        System.out.print("Ingrese el porcentaje de incremento: ");
        porcentaje = sc.nextDouble();

        incremento = salario * porcentaje / 100;

        nuevoSalario = salario + incremento;

        System.out.println("Incremento: " + incremento);
        System.out.println("Nuevo salario: " + nuevoSalario);

        sc.close();
    }
}
