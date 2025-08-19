public class Main {
    public static void main(String[] args) {
        

        Contabancaria conta1 = new Contabancaria();
        Contabancaria conta2 = new Contabancaria();

       
        conta1.numeroconta = "001";
        conta1.titular = "joão";
        conta1.saldo = 1000.0;

        
        conta2.numeroconta = "002";
        conta2.titular = "caio";
        conta2.saldo = 500.0;

        
        System.out.println("=== operações conta 1 ===");
        conta1.consultarSaldo();
        conta1.depositar(200);
        conta1.sacar(150);
        conta1.consultarSaldo();

        
        System.out.println("\n=== operações conta 2 ===");
        conta2.consultarSaldo();
        conta2.depositar(300);
        conta2.sacar(900); 
        conta2.consultarSaldo();
    }
}
