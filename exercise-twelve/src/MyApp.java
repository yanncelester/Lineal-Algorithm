import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Doy título al programa y declaro las variables
        System.out.println("Programa para saber cuanto se va a pagar por un artículo");
        double priceItem, priceWithdiscount, finalPrice;
        final double ivaItem = 0.15;
        final double discount = 0.2;

        //Habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Permito el ingreso de datos
        System.out.print("Ingrese el valor del producto: ");
        priceItem = keyboard.nextDouble();

        //Calculo
        priceWithdiscount = priceItem - (priceItem * discount);
        finalPrice = priceWithdiscount + (priceWithdiscount *ivaItem);

        //Imprimo por pantalla los valores
        System.out.println("El precio con descuento es $" + priceWithdiscount);
        System.out.println("El precio final es $" + finalPrice);



    }
}
