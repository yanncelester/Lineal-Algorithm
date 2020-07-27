import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa para ver costo de alojamiento");
        int nightHotel, costRoom, bill;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese el costo de la habitación: ");
        costRoom = keyboard.nextInt();
        System.out.print("Ingrese la duración de la estadía: ");
        nightHotel = keyboard.nextInt();

        bill = nightHotel * costRoom;
        System.out.println("El costo a abonar por la estadía es de: " + bill);
    }
}
