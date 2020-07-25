import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Muestro título del programa y declaro variables
        System.out.println("Programa para determinar pago");
        double usePercc, costPercc;
        double bill;

        //Habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de datos
        System.out.print("Ingresar consumo por cc: ");
        usePercc = keyboard.nextDouble();
        System.out.print("Ingresar costo por cc: ");
        costPercc = keyboard.nextDouble();

        //Calculo e imprimo en pantalla
        bill = usePercc * costPercc;
        System.out.println("El pago a realizar es de $" + bill);


    }
}
