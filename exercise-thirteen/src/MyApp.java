import java.util.Scanner;

public class MyApp {

    public static void main(String[] args) {
        //Doy título al ejercicio y declaro variables
        System.out.println("Ahorro de sueldo");
        double salary, salaryPermonth, salaryPeryear;
        final double DISCOUNT = 0.65;
        final double MONTHS = 12;

        //Habilito el ingreso por teclado
        Scanner keyboard = new Scanner(System.in);

        //Permito el ingreso de datos
        System.out.print("Ingresar sueldo: $");
        salary = keyboard.nextDouble();

        //Hago los calculos
        salaryPermonth = salary * DISCOUNT;
        salaryPeryear = salaryPermonth * MONTHS;

        //Muestro el resultado
        System.out.println("El ahorro de un año es $" + salaryPeryear);



    }
}
