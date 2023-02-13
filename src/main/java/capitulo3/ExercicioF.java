/*
* Ler dois valores A e B e efetuar a troca de valores de A -> B e B -> A.
* E exibir os valores depois do processo de troca
* */
package capitulo3;
import java.util.Scanner;
public class ExercicioF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira o valor de A:");
        String a = input.nextLine();
        System.out.println("Insira o valor de B:");
        String b = input.nextLine();

        readValues(a, b);
    }

    public static void readValues(Object a, Object b) {
        System.out.printf("Antes da Troca\nVariavel A: %s. Variável B: %s\n", a, b);
        Object c = a;
         a = b;
         b = c;
        System.out.printf("Depois da Troca\nVariavel A: %s. Variavel B: %s\n", a, b);
    }



}
