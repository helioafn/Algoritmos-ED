/*
*  Ler quatro valores inteiros e apresentar os resultados em memória das adições e multiplicações, combinando
* as variaveis de forma similar a propriedade distributiva (a * b) (a * c) etc..
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c, d;

        System.out.println("Insira o valor de A: ");
        a = input.nextInt();
        System.out.println("Insira o valor de B: ");
        b = input.nextInt();
        System.out.println("Insira o valor de C: ");
        c = input.nextInt();
        System.out.println("Insira o valor de D: ");
        d = input.nextInt();

        int[] resultadosMultiplicacao = new int[6];
        int[] resultadosAdicao = new int[6];

        resultadosMultiplicacao[0] = a * b;
        resultadosMultiplicacao[1] = a * c;
        resultadosMultiplicacao[2] = a * d;
        resultadosMultiplicacao[3] = b * c;
        resultadosMultiplicacao[4] = b * d;
        resultadosMultiplicacao[5] = c * d;

        resultadosAdicao[0] = a + b;
        resultadosAdicao[1] = a + c;
        resultadosAdicao[2] = a + d;
        resultadosAdicao[3] = b + c;
        resultadosAdicao[4] = b + d;
        resultadosAdicao[5] = c + d;

        for (int number :
                resultadosMultiplicacao) {
            System.out.printf("%d ", number);
        }

        System.out.println();

        for (int number :
                resultadosAdicao) {
            System.out.printf("%d ", number);
        }

    }
}
