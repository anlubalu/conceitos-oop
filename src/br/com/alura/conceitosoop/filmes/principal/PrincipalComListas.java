package br.com.alura.conceitosoop.filmes.principal;

import br.com.alura.conceitosoop.filmes.modelos.Filme;
import br.com.alura.conceitosoop.filmes.modelos.Serie;
import br.com.alura.conceitosoop.filmes.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

//        ArrayList<Titulo> lista = new ArrayList<>();
        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("D", 2001));
        listaTitulos.add(new Titulo("A", 2002));
        listaTitulos.add(new Titulo("B", 2000));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }

        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Elemento 1");
        listaArrayList.add("Elemento 2");

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Elemento A");
        listaLinkedList.add("Elemento B");

        System.out.println("ArrayList: " + listaArrayList);
        System.out.println("LinkedList: " + listaLinkedList);

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1");
        listaPolimorfica.add("Elemento 2");
        System.out.println("ArrayList: " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A");
        listaPolimorfica.add("Elemento B");
        System.out.println("LinkedList: " + listaPolimorfica);
    }
}