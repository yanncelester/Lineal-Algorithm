import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa para calcular el area de un cuadrado");
        double heighSquare, areaSquare;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese un lado del cuadrado: ");
        heighSquare = keyboard.nextDouble();

        areaSquare = Math.pow(heighSquare,2);
        System.out.println("El area del cuadrado es: " + areaSquare);

    }
}
