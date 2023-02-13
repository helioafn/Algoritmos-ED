/*
* Escrever um programa que leia uma medida em pés, calcule, armazene e apresente o seu valor convertido em metros,
* lembrando que um pé mede 0,3048 metro (30,48cm).
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double PE_METRO = 0.3048; // 1 pé em metro
        double pes, pesEmMetros;

        System.out.println("Insira a distância em pés:");
        pes = input.nextDouble();
        pesEmMetros = pes * PE_METRO;

        System.out.printf("%.3fft convertido em metros %.3fm", pes, pesEmMetros);
    }
}
