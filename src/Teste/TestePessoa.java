package Teste;

import TipoPessoa.Pessoa;

public class TestePessoa {
    public static void main(String[] args) {
        //Criação da pessoa
        Pessoa Daniel = new Pessoa("Daniel", "Costa", 75000, 171);

        Pessoa Aline = new Pessoa("Aline", "Costa", 50000, 150);
        //Realização das nomeações
        System.out.println("O nome da Pessoa: " + Daniel.getNomeCompleto());

        System.out.println("O peso da pessoa: " + Daniel.getPesoEmKilogramas());

        System.out.println("A altura da pessoa: " + Daniel.getAlturaEmMetros());

        System.out.println();

        System.out.println("O nome da Pessoa: " + Aline.getNomeCompleto());

        System.out.println("O peso da pessoa: " + Aline.getPesoEmKilogramas());

        System.out.println("A altura da pessoa: " + Aline.getAlturaEmMetros());
    }
}