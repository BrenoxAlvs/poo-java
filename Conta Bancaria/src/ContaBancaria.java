public class ContaBancaria {
    String titular;
    double saldo = 50;

    void depositar(double valor){
        if (valor > 0) {
            saldo = saldo + valor;
            System.out.println("DEPÓSITO REALIZADO PARA: " + titular);
        } else {
            System.out.println("VALOR INVÁLIDO PARA: " + titular);
        }
    }
    void sacar(double valor){
        if (valor > 0 && valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("\nSAQUE REALIZADO PARA: " + titular);
        } else {
            System.out.println("\nSAQUE INVÁLIDO OU SALDO INSUFICIENTE PARA: " + titular);
        }
    }
}