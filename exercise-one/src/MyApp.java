import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa que suma dos números dados");
        //defino las variables
        int firstNumber;
        int secondNumber;
        int result;

        //habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);
        //leo los datos del usuario
        System.out.print("Ingrese el primer número para el calculo: ");
        firstNumber = keyboard.nextInt();
        System.out.print("Ingrese el segundo número para el calculo: ");
        secondNumber = keyboard.nextInt();
        // realizo proceso y lo guardo en result
        result = firstNumber + secondNumber;
        //lo muestro
        System.out.println("El resultado es:" + result);
    }
}
