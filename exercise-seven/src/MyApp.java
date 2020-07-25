import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Doy título y declaro variables
        System.out.println("Programa para determinar costo de boleto");
        double distance, pricePerKm;
        double ticket;

        //Habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de datos
        System.out.print("Ingrese los km a recorrer: ");
        distance = keyboard.nextDouble();
        System.out.print("Ingrese el costo por kilómetro: ");
        pricePerKm = keyboard.nextDouble();

        //Calculo:
        ticket = distance * pricePerKm;

        //Muestro resultado:
        System.out.println("El costo del boleto es: "+ ticket);
    }
}
