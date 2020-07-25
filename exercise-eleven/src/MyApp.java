import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa para determinar valor a abonar");
        double usePerkw, costKw;
        double bill;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingresar consumo del usuario por KW: ");
        usePerkw = keyboard.nextDouble();
        System.out.print("Ingresar costo por KW: ");
        costKw = keyboard.nextDouble();

        bill = usePerkw * costKw;
        System.out.println("Valor a abonar $" + bill);
    }
}
