// Tratamento de Exceção
// Questão 4
// Arthur Moura Bernardo - 201905523

class ContaBancaria {
    private double saldo;

    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        this.saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Saldo atual: " + this.saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
