package src;

public class QuicksortLomuto {

    public static void quicksort(int[] vetor, int inicio, int fim) {

        if (fim <= inicio) {
            return;
        }

        int i = lomuto(vetor, inicio, fim);

        quicksort(vetor, inicio, i - 1);
        quicksort(vetor, i + 1, fim);
    }

    public static int lomuto(int[] vetor, int inicio, int fim) {

        int pivo = vetor[fim];
        int i = inicio;

        for (int j = inicio; j < fim; j++) {

            if (vetor[j] <= pivo) {

                int aux = vetor[j];
                vetor[j] = vetor[i];
                vetor[i] = aux;

                i++;
            }
        }

        vetor[fim] = vetor[i];
        vetor[i] = pivo;

        return i;
    }

}
