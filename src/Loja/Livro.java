package Loja;

public class Livro extends Produto implements Calculavel {
    private String autor;
    private int preco;

    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
