package File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Titulo {
    // Defina os atributos da classe aqui

    public static void main(String[] args) {
        Titulo titulo = new Titulo();

        // Configuração do Gson com Pretty Printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}