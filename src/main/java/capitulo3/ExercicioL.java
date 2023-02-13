/*
*   Conversão de real para dólar
*   Ler do usuário a quantidade de reais e a cotação do dólar, fazer a conversão,
*   então apresentar o resultado armazenado em memória
*  */
package capitulo3;
import java.util.Scanner;
public class ExercicioL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a quantidade de reais:");
        double qtdReais = input.nextDouble();
        System.out.println("Insira a cotação do dólar:");
        double cotacaoDolar = input.nextDouble();

        double dolar = qtdReais / cotacaoDolar;
        System.out.printf("R$%.2f a cotação de R$%.2f são $%.2f\n", qtdReais, cotacaoDolar, dolar);

    }
}
