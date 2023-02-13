/*
 *   Ler o salario mensal do usuário, o valor do percentual de reajuste e apresentar o novo salario ajustado
 * */
package capitulo3;

import java.util.Scanner;

public class ExercicioP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salarioAtual, percentualReajuste, novoSalario;

        System.out.println("Insira o seu salario atual:");
        salarioAtual = input.nextDouble();
        System.out.println("Insira o percentual do reajuste:");
        percentualReajuste = input.nextDouble();

        novoSalario = salarioAtual + (salarioAtual * (percentualReajuste / 100));
        System.out.printf("Seu salário antes do reajuste: R$%.2f\nSeu salario após o reajuste de %.2f%%: R$%.2f",
                salarioAtual, percentualReajuste, novoSalario);
    }
}
