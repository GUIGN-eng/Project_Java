public class Teste {
    public static void main(String[] args) {

        ContaBancaria guilherme = new ContaBancaria("Guilherme", 3000);
        ContaBancaria matheus = new ContaBancaria("Matheus", 1000);

        guilherme.mostrardados();
        matheus.mostrardados();

        guilherme.aplicartaxa();
        matheus.aplicartaxa();

        guilherme.mostrardados();
        matheus.mostrardados();

        ContaBancaria.alterartaxa(0.2);

        guilherme.aplicartaxa();
        matheus.aplicartaxa();

        guilherme.mostrardados();
        matheus.mostrardados();
    }
}
