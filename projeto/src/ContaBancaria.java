public class ContaBancaria {
    private String titular;
    private double saldo;
    static double taxa = 0.02;

    ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;

    }
    void depositar(double valor){
        saldo = saldo + valor;

    }
    void  sacar(double valor){
        saldo = saldo - valor;

    }
    void aplicartaxa(){
        saldo -= saldo * taxa;

    }
    static void alterartaxa(double novataxa){
taxa = novataxa;

    }
    void mostrardados(){
        System.out.println("Nome: " + titular + "\n" +
                "Saldo: " + saldo);
    }
}
