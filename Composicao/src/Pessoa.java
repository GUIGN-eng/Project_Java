public class Pessoa {
    private String nome;
    private String cpf;
    private String endereço;
    private Telefone telefone;

    public Pessoa(String nome, String cpf, String endereço,
                  String telefoneComercial, String telefonePessoal) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
        this.telefone = new Telefone(telefoneComercial, telefonePessoal);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public void setTelefoneComercial(String telefoneComercial) {
        telefone.setTelefoneComercial(telefoneComercial);
    }

    public String getTelefoneComercial() {
        return telefone.getTelefoneComercial();
    }
    public String getTelefonePessoal(){
        return telefone.getTelefonePessoal();
    }
    public void setTelefonePessoal(String telefonePessoal){
        telefone.setTelefonePessoal(telefonePessoal);
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}
