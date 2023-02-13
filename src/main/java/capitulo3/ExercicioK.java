/*
*   Conversão de dólar para real
*   Ler do usuário a cotação do dólar e a quantidade de dólares disponíveis com o usuário, fazer a conversão e apresentar
*   o resultado armazenado em memória.
*  */
package capitulo3;
import java.util.Scanner;
public class ExercicioK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de dólares:");
        double qtdDolares = input.nextDouble();
        System.out.println("Insira a cotação do dólar:");
        double cotacaoDolar = input.nextDouble();

        double real = qtdDolares * cotacaoDolar;
        System.out.printf("$%.2f a cotação de R$%.2f são R$%.2f\n", qtdDolares, cotacaoDolar, real);
    }
}
