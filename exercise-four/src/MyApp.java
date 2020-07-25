import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {

        //Defino variables, y muestro título
        System.out.println("Programa para mostrar cuanto cobrar por estancionamiento");
        int hoursQuantity, pricePerhour;
        int priceParking;

        //Habilito ingreso por teclado de datos
        Scanner keyboard = new Scanner(System.in);

        //Pido el ingreso de datos
        System.out.print("Ingrese cantidad de horas de estadía: ");
        hoursQuantity = keyboard.nextInt();
        System.out.print("Ingrese el valor de la hora a cobrar: ");
        pricePerhour = keyboard.nextInt();

        //Calculo e imprimo por pantalla
        priceParking = hoursQuantity * pricePerhour;
        System.out.println("El valor a abonar es: " + priceParking);

    }
}
