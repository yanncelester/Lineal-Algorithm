import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Doy título al ejercicio y declaro variables
        System.out.println("Programa para calcular tiempo que se demora en llegar a un lugar");
        int distanceInkm, speedInkm;
        int time;

        //Habilito ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de datos
        System.out.print("Ingrese distancia en KM: ");
        distanceInkm = keyboard.nextInt();
        System.out.print("Ingrese la velocidad en KM/H: ");
        speedInkm = keyboard.nextInt();

        //Calculo y muestro el resultado
        time = distanceInkm / speedInkm;
        System.out.println("Tiempo que se demora en llegar: " + time);
    }
}
