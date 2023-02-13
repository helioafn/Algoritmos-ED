/*
* Ler os votos válidos de três candidatos (A, B, C), os votos nulos e brancos, calcular e apresentar o total de eleitores
* (considerando votos nulos e brancos), e o percentual de cada candidato relacionados ao total de eleitores, o percentual
* de votos nulos e brancos relacionados ao total de eleitores.
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int votosCandidatoA, votosCandidatoB,
            votosCandidatoC, votosBrancos,
            votosNulos, totalEleitores;
        double percentualVotosCandidatoA,
                percentualVotosCandidatoB,
                percentualVotosCandidatoC,
                percentualVotosBranco,
                percentualVotosNulo;

//        Recebendo os dados do usuário
        System.out.println("Insira a quantidade de votos do candidato A:");
        votosCandidatoA = input.nextInt();
        System.out.println("Insira a quantidade de votos do candidato B:");
        votosCandidatoB = input.nextInt();
        System.out.println("Insira a quantidade de votos do candidato C:");
        votosCandidatoC = input.nextInt();
        System.out.println("Insira a quantidade de votos branco:");
        votosBrancos = input.nextInt();
        System.out.println("Insira a quantidade de votos nulo:");
        votosNulos = input.nextInt();
        totalEleitores = votosCandidatoA + votosCandidatoB +
                votosCandidatoC + votosNulos + votosBrancos;

//      Calculando os percentuais
        percentualVotosCandidatoA = ((double)votosCandidatoA / totalEleitores) * 100;
        percentualVotosCandidatoB = ((double)votosCandidatoB / totalEleitores) * 100;
        percentualVotosCandidatoC = ((double)votosCandidatoC / totalEleitores) * 100;
        percentualVotosBranco = ((double)votosBrancos / totalEleitores) * 100;
        percentualVotosNulo = ((double)votosNulos / totalEleitores) * 100;


        System.out.printf("Total de eleitores: %d\n" +
                        "Percentual de votos do candidato A: %.2f%%\n" +
                        "Percentual de votos do candidato B: %.2f%%\n" +
                        "Percentual de votos do candidato C: %.2f%%\n" +
                        "Percentual de votos brancos: %.2f%%\n" +
                        "Percentual de votos nulos: %.2f%%\n",
                totalEleitores,
                percentualVotosCandidatoA,
                percentualVotosCandidatoB,
                percentualVotosCandidatoC,
                percentualVotosBranco,
                percentualVotosNulo);
    }
}
