import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int op;
        int op2;
        int area ;
        int perimetro;
        int lado;
        int base;
        int altura;
        float radio;
        int apotema;
        int a, b, c;
        int cantidad = 0;
        int i = 0;

        ArrayList<Integer> figuras = new ArrayList<>();
        ArrayList<Integer> figuras2 = new ArrayList<>();

        Scanner leer=new Scanner (System.in);

        do {
            System.out.println("Elige que figura geometrica calcular: ");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectangulo");
            System.out.println("3. Circulo");
            System.out.println("4. Pentagono");
            System.out.println("5. Triangulo");
            System.out.println("6. Calcular Potencia");
            System.out.println("7. Salir");
            System.out.print("Opción: ");
            op = leer.nextInt();
            System.out.print("\n\n");

            System.out.println("Elige que calcular:");
            System.out.println("1. Area");
            System.out.println("2. Perimetro");
            System.out.print("Opción: ");
            op2 = leer.nextInt();

            cantidad = cantidad + 1;

            switch (op) {
                case 1:
                    if (op2 == 1) {
                        System.out.print("Escribe valor del lado de tu cuadrado: ");
                        lado = leer.nextInt();
                        area = lado * lado;
                        figuras.add(area);
                    } else {
                        System.out.print("Escribe valor del lado de tu cuadrado: ");
                        lado = leer.nextInt();
                        perimetro = 4 * lado;
                        System.out.print("El perimetro es: " + perimetro);
                        figuras2.add(perimetro);
                    }
                    break;
                case 2:
                    if (op2 == 1) {
                        System.out.print("Escribe valor de la base del rectangulo: ");
                        base = leer.nextInt();
                        System.out.print("Escribe valor de la altura del rectangulo: ");
                        altura = leer.nextInt();
                        area = base * altura;
                        figuras.add(area);
                    } else {
                        System.out.print("Escribe valor de la base del rectangulo: ");
                        base = leer.nextInt();
                        System.out.print("Escribe valor de la altura del rectangulo: ");
                        altura = leer.nextInt();
                        perimetro = 2 * base + 2 * altura;
                        figuras2.add(perimetro);
                    }
                    break;
                case 3:
                    if (op2 == 1) {
                        System.out.print("Escribe el radio del circulo: ");
                        radio = leer.nextFloat();
                        area = (int)(3.14 * radio * radio);
                        figuras.add(area);
                    } else {
                        System.out.print("Escribe el radio del circulo: ");
                        radio = leer.nextInt();
                        perimetro = (int)(2 * 3.14 * radio);
                        figuras2.add(perimetro);
                    }
                    break;
                case 4:
                    if (op2 == 2) {
                        System.out.print("Escribe el valor de los lados del pentagono: ");
                        lado = leer.nextInt();
                        perimetro = 5 * lado;
                        figuras2.add(perimetro);
                    } else {
                        System.out.print("Escribe el valor del apotema del pentagono: ");
                        apotema = leer.nextInt();
                        System.out.print("Escribe el perimetro de tu pentagono: ");
                        perimetro = leer.nextInt();
                        area = (perimetro * apotema)/2;
                        figuras.add(area);
                    }
                    break;
                case 5:
                    if (op2 == 1) {
                        System.out.print("Escribe el valor de la base del triangulo: ");
                        base = leer.nextInt();
                        System.out.print("Escribe el valor de la altura del triangulo: ");
                        altura = leer.nextInt();
                        area = (base * altura)/2;
                        figuras.add(area);
                    } else {
                        System.out.print("Escribe el valor del primer lado del trianulo: ");
                        a = leer.nextInt();
                        System.out.print("Escribe el valor del segundo lado del trianulo: ");
                        b = leer.nextInt();
                        System.out.print("Escribe el valor del tercer lado del trianulo: ");
                        c = leer.nextInt();
                        perimetro = a + b + c;
                        figuras2.add(perimetro);
                    }
                    break;
                case 6:
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Opcion invalida, ingrese de nuevo su opcion");
            }

        } while (op != 7);
        System.out.println("Areas calculadas: ");
        for (int f : figuras) {
            i++;
            System.out.println(i + " Figura");
            System.out.println("\t-Area: "+ f);
        }
        i = 0;
        System.out.println("Perimetros calculados: ");
        for (int p : figuras2) {
            i++;
            System.out.println(i + " Figura");
            System.out.println("\t-Perimetro: " + p);
        }
    }
}