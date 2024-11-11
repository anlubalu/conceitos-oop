package Animal;

public class TesteAnimais {
    public static void main(String[] args) {
//        Cachorro cachorro = new Cachorro();
//        cachorro.emitirSom();
//        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.emitirSom();
        gato.arranharMoveis();

        Animal animal = new Cachorro();

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
