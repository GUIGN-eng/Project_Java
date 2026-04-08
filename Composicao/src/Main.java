public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("abc", "1234", "Rua x ",
                "1234", "1234567");
        System.out.println(pessoa.getTelefoneComercial());

    pessoa.setTelefoneComercial("asdfghj");
        pessoa.setTelefone( new Telefone("dcfvgbhjk", "sdfghjklç"));



        System.out.println(pessoa.getTelefone().getTelefonePessoal());
    }
}
