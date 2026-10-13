package src;

public class Main {
    public static void main(String[] args) {
        
        int[] vetor = {9, 4, 7, 2, 8, 3, 6};
        QuicksortLomuto.quicksort(vetor, 0, vetor.length - 1);

        for (int i : vetor) {
            System.out.println(i);
        }
    }
}
