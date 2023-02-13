/*
* Leia do usuário a distância e o tempo que um projetil percorreu e calcule a sua velocidade em metros/segundo
* usando a fórmula: V <- (distancia * 1000) / (tempo * 60)
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia, tempo, velocidade;

        System.out.println("Insira a distância percorrida:");
        distancia = input.nextInt();
        System.out.println("Insira o tempo gasto:");
        tempo = input.nextDouble();

        velocidade = (distancia * 1000) / (tempo * 60); // Velocidade se mede em m/s, por isso d*1000 e tempo*60
        System.out.printf("O projetil percorreu %.1f quilometros em %.1f minutos a %.1f m/s", distancia, tempo, velocidade);
    }
}
