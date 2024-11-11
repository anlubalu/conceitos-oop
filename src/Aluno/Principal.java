package Aluno;

//Classe br.com.alura.conceitosoop.filmes.principal.Principal
public class Principal {
    public static void main(String[] args) {
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Akemi";
        meuAluno.idade = 18;

        meuAluno.exibeInformacoes();
    }
}