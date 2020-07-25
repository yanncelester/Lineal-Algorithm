import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa para determinar la edad de los solicitantes");
        int yearOfbirth;
        final int year = 2020;
        int age;

        //Disponibilizo el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Ingresar año de nacimiento del solicitante: ");
        yearOfbirth = keyboard.nextInt();

        //Hago el calculo y lo imprimo
        age = year - yearOfbirth;
        System.out.println("La edad del solicitante es: " + age);


    }
}
