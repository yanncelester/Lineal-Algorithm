import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Doy título a mi programa y declaro la variable
        System.out.println("Programa para calcular monto del cheque");
        double hotelPerDay, days, foodAndbeverages, totalHotel, totalFood, totalMoney, totalTrip;
        final double MONEY_ADDITION = 100;

        //Habilito ingreso de datos
        Scanner keyboard = new Scanner(System.in);

        //Ingreso de datos
        System.out.print("Ingrese cantidad de días que durará el viaje: ");
        days = keyboard.nextDouble();
        System.out.print("Ingrese costo del hotel por día: ");
        hotelPerDay = keyboard.nextDouble();
        System.out.print("Ingrese el costo de alimentos por día: ");
        foodAndbeverages = keyboard.nextDouble();

        //Hago el calculo y muestro por pantalla:
        totalHotel = hotelPerDay * days;
        totalFood = foodAndbeverages * days;
        totalMoney = MONEY_ADDITION * days;
        totalTrip = totalFood + totalHotel + totalMoney;
        System.out.println("El costo total de alojamiento es: " + totalHotel);
        System.out.println("El costo total por alimentos es: "+ totalFood);
        System.out.println("El costo total fijo es de: " + totalMoney);
        System.out.println("El costo total del viaje es de :"+ totalTrip);




    }
}
