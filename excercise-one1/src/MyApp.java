import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa que calcula el área de un triángulo");
        //Defino las variables
        int base, height;
        int area;

        //Doy la opción de ingreso de datos
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese la base del triangulo: ");
        base = keyboard.nextInt();
        System.out.print("Ingrese la altura del triangulo: ");
        height = keyboard.nextInt();

        //Hago el calculo y lo muestro
        area = ((base * height) / 2);
        System.out.println("La altura del triangulo es: "+ area);
    }
}
