public class Randomizer {

    public static int indiceAleatorio(int inicio, int fim) {
        return inicio + (int) (Math.random() * (fim - inicio + 1));
    }

}