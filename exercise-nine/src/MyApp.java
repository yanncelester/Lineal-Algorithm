import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        // Muestro título y declaro variables
        System.out.println("Costo de llamada");
        int callPerminute, costPerminute;
        int costCall;

        //Habilito ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de datos
        System.out.print("Ingrese el tiempo de duración de la llamada por minuto: ");
        callPerminute = keyboard.nextInt();
        System.out.print("Ingrese el costo por minuto de la llamada: ");
        costPerminute = keyboard.nextInt();

        //Calculo e imprimo por pantalla
        costCall = callPerminute * costPerminute;
        System.out.println("El costo de una llamada (en minutos): " + costCall);


    }
}
