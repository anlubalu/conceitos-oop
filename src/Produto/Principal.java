package Produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
//        Produto produto = new Produto("Celular", 2000.0, 2);

//        System.out.println("Nome do Produto: " + produto.getNome());
//        System.out.println("Preço: " + produto.getPreco());
//
//        produto.aplicarDesconto(10);
//        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);
        Produto produto3 = new Produto("Ventilador", 150.0, 2);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double somaPrecos = 0;
        System.out.println("Tamanho da lista: " + listaProdutos.size());
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        for (Produto produto : listaProdutos) {
            System.out.println(produto);
            somaPrecos += produto.getPreco();
        }

        double precoMedio = somaPrecos / listaProdutos.size();
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}
