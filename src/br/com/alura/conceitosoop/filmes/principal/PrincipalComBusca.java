package br.com.alura.conceitosoop.filmes.principal;

import br.com.alura.conceitosoop.filmes.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.conceitosoop.filmes.modelos.Titulo;
import br.com.alura.conceitosoop.filmes.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        String busca = "";
        Scanner leitura = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                break;
            }

            String chave = "dae38283";

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=" + chave;
            System.out.println(endereco);

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                System.out.println(response.body());

                String json = response.body();
                System.out.println(json);

                // Java 17 aceita a classe record, que traduz uma classe para outra, com construtor e get/set criados
                // CÓDIGO DE EXEMPLO DA DOCUMENTAÇÃO GSON

                Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);
                // arruma o código


                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo já convertido");
                System.out.println(meuTitulo);

                FileWriter escrita = new FileWriter("filmes.txt");
                escrita.write(meuTitulo.toString());
                escrita.close();

                titulos.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

            System.out.println(titulos);
            FileWriter escrita = new FileWriter("filmes.json");
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();
            escrita.write(gson.toJson(titulos));
            escrita.close();
            System.out.println("O programa finalizou corretamente!");
        }
    }
}
