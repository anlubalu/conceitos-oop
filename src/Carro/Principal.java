package Carro;

//Classe br.com.alura.conceitosoop.filmes.principal.Principal
public class Principal {
    public static void main(String[] args) {
//        Carro meuCarro = new Carro();
//        meuCarro.modelo = "Gol";
//        meuCarro.ano = 2023;
//        meuCarro.cor = "Preto";
//
//        // Exibir ficha técnica
//        meuCarro.exibeFichaTecnica();
//
//        // Calcular idade do carro
//        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");

        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
    }
}