import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa que calcula potencia electrica");
        int power, voltage, electricCurrent, resistance;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingresar resistencia en ohmnios: ");
        resistance = keyboard.nextInt();
        System.out.print("Ingrese valor de la corriente: ");
        electricCurrent = keyboard.nextInt();

        voltage = resistance * electricCurrent;
        power = voltage * electricCurrent;

        System.out.println("La potencia electrica es: " + power);
    }
}
