/*
*   Efetuar a leitura de um valor numérico e apresentar este valor elevado ao quadrado,
*   sem armazenar o resultado em memória.
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insira um número inteiro:");
        int userInput = input.nextInt();

        System.out.printf("%d²=%d\n", userInput, (userInput * userInput));
    }
}
