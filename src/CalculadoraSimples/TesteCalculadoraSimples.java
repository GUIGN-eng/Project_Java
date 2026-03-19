package CalculadoraSimples;

public class TesteCalculadoraSimples {
    public static void main(String[] args) {
        CalculadoraSimples cal = new CalculadoraSimples();
        System.out.println("O valor de somar é: " + cal.somar(1,2));
        System.out.println("O valor da subtração é: " + cal.subtrair(3,4));
        System.out.println("O valor da multiplicação é: " + cal.multiplicar(5,6));
        System.out.println("O valor da divisão é: " + cal.dividir(7,8));
    }
}