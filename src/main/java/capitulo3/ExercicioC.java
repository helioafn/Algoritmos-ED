/*
*  Calcular e apresentar o volume de uma lata de oleo usando a formula:
*  V <- 3.14159 * R^2 * altura
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioC {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a altura da lata:");
        double altura = input.nextDouble();
        System.out.println("Insira o raio da lata:");
        double raio = input.nextDouble();

        double volume = Math.PI * (raio * raio) * altura;

        System.out.printf("O volume da lata é %.2f", volume);
    }
}
