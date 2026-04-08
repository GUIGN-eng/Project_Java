public class Casa extends Imovel{
    double areaDoTerreno;

    public Casa(int id, String endereco, double valor, double areaDoTerreno) {
        super(id, endereco, valor);
        this.areaDoTerreno = areaDoTerreno;
    }
    public void imprimeDados(){
        super.imprimeDados();
        System.out.println("Área: " + areaDoTerreno);
    }
}
