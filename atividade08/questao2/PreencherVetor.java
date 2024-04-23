// Tratamento de Exceção
// Questão 2
// Arthur Moura Bernardo - 201905523

import java.util.InputMismatchException;
import java.util.Scanner;

public class PreencherVetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int[] vetor = new int[10];
            int index = 0;

            while (true) {
                System.out.print("Digite um valor inteiro (0 para sair): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    vetor[index] = valor;
                    break;
                }

                vetor[index] = valor;
                index++;

                if (index >= 10) {
                    throw new ArrayIndexOutOfBoundsException("Você excedeu o limite de 10 valores.");
                }
            }

            System.out.println("Valores digitados:");

            for (int i = 0; i < index; i++) {
                System.out.println(vetor[i]);
            }

        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: O valor informado não é numérico.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Você excedeu o limite de 10 valores.");
        } finally {
            scanner.close();
        }
    }
}
