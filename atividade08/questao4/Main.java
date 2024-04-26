// Tratamento de Exceção
// Questão 4
// Arthur Moura Bernardo - 201905523
public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        try {
            conta.sacar(500); // saque normal
            conta.sacar(800); // saque para lançar exceção SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}
