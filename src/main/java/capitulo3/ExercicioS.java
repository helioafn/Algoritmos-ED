/*
*   Ler dois valores reais (a, b) do usuário, armazenar e calcular os resultados das quatros operações aritméticas
*   básicas.
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, soma, produto, divisao, subtracao;

        System.out.println("Insira o valor de A:");
        a = input.nextDouble();
        System.out.println("Insira o valor de B:");
        b = input.nextDouble();

        soma = a + b;
        subtracao = a - b;
        produto = a * b;
        divisao = a / b;

        System.out.printf("%.2f + %.2f = %.2f\n" +
                "%.2f - %.2f = %.2f\n" +
                "%.2f * %.2f = %.2f\n" +
                "%.2f / %.2f = %.2f\n",
                a, b, soma, a, b, subtracao, a, b, produto, a, b, divisao);
    }
}
