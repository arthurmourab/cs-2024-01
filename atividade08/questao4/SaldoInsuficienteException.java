// Tratamento de Exceção
// Questão 4
// Arthur Moura Bernardo - 201905523

class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente para realizar esta operação.");
    }
}
