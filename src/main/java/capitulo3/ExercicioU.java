/*
* Leia do usuário o raio de uma esfera e calcule o volume da mesma, usando a formula:
* V <- (4/3) * PI * RAIO³
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raioEsfera, volumeEsfera;

        System.out.println("Insira o raio da esfera:");
        raioEsfera = input.nextDouble();

        volumeEsfera = (double)(4/3) * Math.PI * (raioEsfera * raioEsfera * raioEsfera);

        System.out.printf("O volume da esfera é: %.3f\n", volumeEsfera);
    }
}
