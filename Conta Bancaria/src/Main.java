public class Main {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        conta1.titular = "Jailson Mendes";
        conta2.titular = "Lucio Souza";

        conta1.depositar(200);
        conta2.sacar(50);

        System.out.println("\nTitular: " + conta1.titular);
        System.out.println("Saldo: R$" + conta1.saldo);
        System.out.println("\nTitular: " + conta2.titular);
        System.out.println("Saldo: R$" + conta2.saldo);
    }
}