public class Main {
    public static void main(String[] args) {
        
        int[] vetor = {9, 10, 4, 3, 8, 3, 2};
        QuicksortLomuto.quicksortAleatorio(vetor, 0, vetor.length - 1);

        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
