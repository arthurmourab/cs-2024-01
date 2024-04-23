// Tratamento de Exceção
// Questão 1
// Arthur Moura Bernardo - 201905523

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisorDeDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double primeiroNumero = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double segundoNumero = scanner.nextDouble();

            double resultado = dividirNumeros(primeiroNumero, segundoNumero);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: O valor informado não é numérico.");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: Divisão por zero.");
        } finally {
            scanner.close();
        }
    }

    public static double dividirNumeros(double numerador, double denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero.");
        }
        return numerador / denominador;
    }
}
