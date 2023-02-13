/*
*   Ler do usuário 4 valores inteiros (A, B, C, D),
*   Apresentar o resultado em memória o PRODUTO do primeiro valor com o terceiro
*   E a SOMA do segundo valor com o quarto valor
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioO {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c, d, soma, produto;

        System.out.println("Insira o valor inteiro de A:");
        a = input.nextInt();
        System.out.println("Insira o valor inteiro de B:");
        b = input.nextInt();
        System.out.println("Insira o valor inteiro de C:");
        c = input.nextInt();
        System.out.println("Insira o valor inteiro de D:");
        d = input.nextInt();

        produto = a * c;
        soma = b + d;

        System.out.printf("O produto AxC -> %dx%d = %d\nA soma B+D -> %d+%d = %d\n", a, c, produto, b, d, soma);
    }
}
