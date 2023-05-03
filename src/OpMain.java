import java.util.Scanner;

public class OpMain {
    public void op(){
        Operaciones operaciones = new Operaciones();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        int x =0,a=0,b=0,i=0;
        double c=0,d=0;
        float e=0,f=0;
        String g,h;

        while (x!=5){
            x = menu.menu(scanner);
            System.out.println("Ingresa un valor entero para A: ");
            a = scanner.nextInt();
            System.out.println("Ingresa un valor entero para B: ");
            b = scanner.nextInt();
            System.out.println("Ingresa un valor tipo double para A: ");
            c = scanner.nextDouble();
            System.out.println("Ingresa un valor tipo double para B: ");
            d = scanner.nextDouble();
            System.out.println("Ingresa un valor tipo float para A: ");
            e = scanner.nextFloat();
            System.out.println("Ingresa un valor tipo float para B: ");
            f = scanner.nextFloat();
            System.out.println("Ingresa un valor tipo String para A: ");
            g = scanner.next();


            switch (x){
                case 1:
                    System.out.println("Ingresa un valor tipo String para B: ");
                    h = scanner.next();
                    System.out.println("La suma de '" + a + "' + '" + b + "' es '" + operaciones.sumar(a,b) + "'");
                    System.out.println("La suma de '" + c + "' + '" + d + "' es '" + operaciones.sumar(c,d) + "'");
                    System.out.println("La suma de '" + e + "' + '" + f + "' es '" + operaciones.sumar(e,f) + "'");
                    System.out.println("La suma de '" + g + "' + '" + h + "' es '" + operaciones.sumar(g,h) + "'");
                    break;
                case 2:
                    System.out.println("Ingresa un valor tipo String para B: ");
                    h = scanner.next();
                    System.out.println("La resta de '" + a + "' - '" + b + "' es '" + operaciones.resta(a,b) + "'");
                    System.out.println("La resta de '" + c + "' - '" + d + "' es '" + operaciones.resta(c,d) + "'");
                    System.out.println("La resta de '" + e + "' - '" + f + "' es '" + operaciones.resta(e,f) + "'");
                    System.out.println("La resta de '" + g + "' - '" + h + "' es '" + operaciones.resta(g,h) + "'");
                    break;
                case 3:
                    System.out.println("Ingresa un valor tipo int para B: ");
                    i = scanner.nextInt();
                    System.out.println("La multiplicacion de '" + a + "' * '" + b + "' es '" + operaciones.multiplicacion(a,b) + "'");
                    System.out.println("La multiplicacion de '" + c + "' * '" + d + "' es '" + operaciones.multiplicacion(c,d) + "'");
                    System.out.println("La multiplicacion de '" + e + "' * '" + f + "' es '" + operaciones.multiplicacion(e,f) + "'");
                    System.out.println("La multiplicacion de '" + g + "' * '" + i + "' es '" + operaciones.multiplicacion(g,i) + "'");
                    break;
                case 4:
                    System.out.println("Ingresa un valor tipo String para B: ");
                    h = scanner.next();
                    System.out.println("La division de '" + a + "' / '" + b + "' es '" + operaciones.division(a,b) + "'");
                    System.out.println("La division de '" + c + "' / '" + d + "' es '" + operaciones.division(c,d) + "'");
                    System.out.println("La division de '" + e + "' / '" + f + "' es '" + operaciones.division(e,f) + "'");
                    System.out.println("La division de '" + g + "' / '" + h + "' es '" + operaciones.division(g,h) + "'");
                    break;
                case 5:
                    System.out.println("Saliste del programa");
                    break;
                default: System.out.println("Ingresa una opcion valida");
            }
        }
    }
}
