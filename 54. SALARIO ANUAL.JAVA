import java.util.Scanner;

public class SalarioAnual {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMensual, incremento, nuevoSalario, anual;

        System.out.print("Ingrese salario mensual: ");
        salarioMensual = sc.nextDouble();

        incremento = salarioMensual * 0.05;

        nuevoSalario = salarioMensual + incremento;

        anual = nuevoSalario * 12;

        System.out.println("Incremento mensual: " + incremento);
        System.out.println("Nuevo salario mensual: " + nuevoSalario);
        System.out.println("Salario anual: " + anual);

        sc.close();
    }
}
