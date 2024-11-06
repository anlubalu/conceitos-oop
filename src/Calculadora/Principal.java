package Calculadora;

//Classe br.com.alura.conceitosoop.filmes.Principal
public class Principal {

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);
    }
}