import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Doy titulo a mi programa y declaro variables
        System.out.println("Programa para calcular la hispotenusa de un triángulo rectangulo");
        double legOne, legTwo;
        double hypotenuse;

        //Habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //Pido ingreso de datos
        System.out.print("Ingrese el valor del cateto 1: ");
        legOne = keyboard.nextDouble();
        System.out.print("Ingrese el valor del cateto 2: ");
        legTwo = keyboard.nextDouble();

        // Calculo
        hypotenuse = Math.sqrt(Math.pow(legOne, 2) + Math.pow(legTwo, 2));

        //Muestro por pantalla
        System.out.println("El valor de la hipotenusa es: " + hypotenuse);
    }
}
