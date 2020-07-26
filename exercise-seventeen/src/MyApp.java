import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        System.out.println("Programa para calcular promedio ponderado de 3 notas");
        double noteOne, noteTwo, noteThree;
        final double weighNoteoneTwo = 0.25, weighnoteThree = 0.5;
        double avergFinal;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese nota uno: ");
        noteOne = keyboard.nextDouble();
        System.out.println("Ingrese nota dos: ");
        noteTwo = keyboard.nextDouble();
        System.out.println("Ingrese nota tres: ");
        noteThree = keyboard.nextDouble();

        avergFinal = ((noteOne * weighNoteoneTwo + noteTwo * weighNoteoneTwo + noteThree * weighnoteThree)/(weighNoteoneTwo* 2 + weighnoteThree));
        System.out.println("El promedio es: " + avergFinal);

    }

}
