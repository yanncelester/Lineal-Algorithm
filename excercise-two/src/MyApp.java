import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //defino variables
        double mexicanMoney, usaMoney;
        final double DOLAR_PRICE = 22.37;

        //Habilito los ingresos por teclado
        Scanner keyboard = new Scanner(System.in);

        //Leo el ingreso del usuario
        System.out.print("Ingresar pesos mexicanos:");
        mexicanMoney = keyboard.nextDouble();

        //Hago el calculo
        usaMoney = mexicanMoney / DOLAR_PRICE;
        //Lo muestro
        System.out.println("Cantidad de dolares " + usaMoney);


    }
}
