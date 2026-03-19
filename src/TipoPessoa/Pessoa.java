package TipoPessoa;

//Classes
public class Pessoa {
    private String Nome;
    private String Sobrenome;
    private int pesoEmGrama;
    private int alturaEmCentimetros;

    //Construtor Padrão
    public Pessoa(){
    }

    //Construtor Definidos
    public Pessoa(String Nome, String Sobrenome, double pesoEmGrama, double alturaEmCentimetros){
        this.Nome = Nome;
        this.Sobrenome = Sobrenome;
        this.pesoEmGrama = (int) pesoEmGrama;
        this.alturaEmCentimetros = (int) alturaEmCentimetros;

    //Classificador getter
    }
    public String getNomeCompleto(){
        return this.Nome + " " + this.Sobrenome;
    }
    public double getPesoEmKilogramas(){
        return this.pesoEmGrama / 1000.0;
    }
    public double getAlturaEmMetros(){
        return this.alturaEmCentimetros / 100.0;
    }
}