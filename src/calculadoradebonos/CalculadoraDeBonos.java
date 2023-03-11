package calculadoradebonos;

/**
 *
 * @author tracher
 *
 * Este programa calcula e imprime el bono por trabajo de una persona.
 *
 */
import java.util.Scanner;


public class CalculadoraDeBonos {

    public static void main(String[] args) {

    int salario; // salario de una persona
    String mensajeDeBono; // especifica el bono de trabajo

    Scanner input = new Scanner(System.in);
    System.out.println("Ingrese el salario de la persona: ");
    salario = input.nextInt();

    mensajeDeBono = "Bono = $" + (.02 * salario);
    System.out.println(mensajeDeBono);

}

}