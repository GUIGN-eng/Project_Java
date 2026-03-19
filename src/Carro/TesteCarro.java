package Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro descreverCarro = new Carro("Esportivo de Luxo", "Ferrari", "Vermelha");
        System.out.println("A descrição do modelo do Carro: " + descreverCarro.Modelo);
        System.out.println("A descrição da marca do Carro: " + descreverCarro.Marca);
        System.out.println("A descrição da cor do Carro: " + descreverCarro.Cor);
    }
}
