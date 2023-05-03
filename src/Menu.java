import java.util.Scanner;

public class Menu {
    public int menu(Scanner scanner){
        System.out.println("\t\t- -  M E N U - -\n1.- Suma\n2.- Resta\n3.- Multiplicacion\n4.- Division\n");
        return scanner.nextInt();
    }
}
