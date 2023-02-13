/*
* Calcular a quantidade de litros de combustível gasta em uma viagem
* O veículo faz 12 km por litro
* Usuário deve fornecer o tempo e a velocidade média durante a viagem.
* Assim podemos calcular a distância usando D <- VM * TEMPO
* A partir disso podemos calcular os litros consumidos usando: LITROS_USADOS <- D / qtdPorKM (12 nesse caso)
* O Programa deve apresentar os valores da Velocidade média (VM), Tempo gasto na viagem, Distância percorrida (D), e a
* quantidade de litros utilizada na viagem (LITROS_USADOS).
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double kmPorLitro =  12; //
        System.out.println("Insira o tempo da viagem:");
        int tempo = input.nextInt();
        System.out.println("Insira a velocidade média do veículo:");
        int velocidadeMedia = input.nextInt();

        double distancia = (double)velocidadeMedia * (double)tempo;
        double litrosUsados = distancia / kmPorLitro;

        System.out.printf("Velocidade média: %dkm/h\n" +
                "Tempo gasto na viagem: %dH\n" +
                "Distância percorrida: %.1fkm\n" +
                "Litros de combustível usados na viagem: %.1fl\n",
                velocidadeMedia, tempo, distancia, litrosUsados
        );
    }
}
