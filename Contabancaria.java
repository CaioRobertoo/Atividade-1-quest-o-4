public class Contabancaria {
    String numeroconta;
    String titular;
    double saldo;

    
    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("deposito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("valor invalido para deposito.");
        }
    }

   
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("saque de R$ " + valor + " realizado com sucesso!");
        } else if (valor > saldo) {
            System.out.println("saldo insuficiente para saque.");
        } else {
            System.out.println("valor invalido para saque.");
        }
    }

    
    void consultarSaldo() {
        System.out.println("saldo atual da conta de " + titular + ": R$ " + saldo);
    }
}
