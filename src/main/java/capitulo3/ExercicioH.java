/*
*  Elaborar um programa que calcule e apresente o valor do volume
* de uma caixa retangular utilizando a formula:
* V <- comprimento * altura * largura
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioH {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double comprimento,
                largura,
                altura,
                volume;

        System.out.println("Insira a altura da caixa: ");
        altura = input.nextDouble();
        System.out.println("Insira o comprimento da caixa: ");
        comprimento = input.nextDouble();
        System.out.println("Insira a largura da caixa: ");
        largura = input.nextDouble();

        volume = comprimento * altura * largura;

        System.out.printf("O volume da caixa retangular é %.2f\n", volume);

    }
}
