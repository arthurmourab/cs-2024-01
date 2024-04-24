public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1000);

        try {
            conta.sacar(500); // Saque normal
            conta.sacar(800); // Isso lançará a exceção SaldoInsuficienteException
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
        }
    }
}