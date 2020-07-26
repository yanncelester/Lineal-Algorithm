import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Muestro título y declaro variables
        System.out.println("Programa para saber costo de llamada teléfonica");
        int costPerminute, minutesOfcall;
        int costCall;

        //Habilito ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Permito ingreso de datos
        System.out.print("Ingreso costo por minuto: ");
        costPerminute = keyboard.nextInt();
        System.out.print("Ingreso duración de la llamada en minutos: ");
        minutesOfcall = keyboard.nextInt();

        //Calculo e imprimo por pantalla
        costCall = costPerminute * minutesOfcall;
        System.out.println("El costo de la llamada es: "+ costCall);


    }
}
