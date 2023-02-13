/*
*   Leia do usuário o valor do raio da circunferência e calcule a área da mesma
*   Use a fórmula: A <- PI * R²
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioQ {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio;

        System.out.println("Insira o valor do raio da circunferência:");
        raio = input.nextDouble();

        double area = Math.PI * (raio * raio);

        System.out.printf("A área da circunferência é: %.2f\n", area);
    }
}
