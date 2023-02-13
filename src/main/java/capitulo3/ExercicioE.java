/*
* Calcular o valor de uma prestação de um bem em atraso, utilizando a fórmula:
* PRESTACAO <- VALOR_PRESTACAO + (VALOR_PRESTACAO * (TAXA_JUROS / 100) * TEMPO_ATRASO
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor da prestação:");
        double prestacao = input.nextDouble();
        System.out.println("Insira a taxa de juros:");
        double taxaJuros = input.nextDouble();
        System.out.println("Insira o tempo de atraso da prestação:");
        int tempoAtraso = input.nextInt();

        double novoValorPrestacao = prestacao + (prestacao * (taxaJuros / 100)) * tempoAtraso;

        System.out.printf("O novo valor da prestação é R$%.2f\n", novoValorPrestacao);
    }
}
