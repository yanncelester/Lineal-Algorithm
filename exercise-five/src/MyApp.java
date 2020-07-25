import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Muestro título y declaro variables
        System.out.println("Programa para calcular presupuesto:");
        double metters, pricePermetters;
        double budget;

        //Habilito ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de datos
        System.out.print("Ingrese cantidad de metros a pintar: ");
        metters = keyboard.nextDouble();
        System.out.print("Ingrese el valor por metro cuadrado del trabajo de pintura: ");
        pricePermetters = keyboard.nextDouble();

        //Calculo y muestro por pantalla
        budget = metters * pricePermetters;
        System.out.println("El presupuesto por trabajo de pintura es: " + budget);

    }
}
