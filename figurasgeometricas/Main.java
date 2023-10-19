package figurasgeometricas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una figura (circulo, cuadrado, triangulo equilatero):");
        String tipoForma = scanner.nextLine();

        Forma forma = null;

        switch (tipoForma.toLowerCase()) {
            case "circulo":
                System.out.println("Ingresa el radio del círculo:");
                double radioCirculo = scanner.nextDouble();
                forma = new Circulo(radioCirculo);
                break;
            case "cuadrado":
                System.out.println("Ingresa el lado del cuadrado:");
                double ladoCuadrado = scanner.nextDouble();
                forma = new Cuadrado(ladoCuadrado);
                break;
            case "triangulo equilatero":
                System.out.println("Ingresa la base del triángulo:");
                double baseTriangulo = scanner.nextDouble();
                System.out.println("Ingresa la altura del triángulo:");
                double alturaTriangulo = scanner.nextDouble();
                forma = new Triangulo(baseTriangulo, alturaTriangulo);
                break;
            default:
                System.out.println("Figura no valida.");
                System.exit(0);
        }

        double area = forma.calcularArea();
        double perimetro = forma.calcularPerimetro();

        System.out.println("Área de la figura: " + area);
        System.out.println("Perímetro de la figura: " + perimetro);

        scanner.close();
    }
}
