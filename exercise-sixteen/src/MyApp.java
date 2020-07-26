import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa para calcular el area de un cuadrado");
        int heighSquare, baseSquare, areaSquare;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingrese altura del cuadrado: ");
        heighSquare = keyboard.nextInt();
        System.out.print("Ingrese base del cuadrado: " );
        baseSquare = keyboard.nextInt();

        areaSquare = heighSquare * baseSquare;
        System.out.println("El area del cuadrado es: " + areaSquare);

    }
}
