import java.util.List;

/**
 * procedure bubbleSort( A : lista elementów do posortowania )
 * n = liczba_elementów(A)
 * do
 * for (i = 0; i < n-1; i++) do:
 * if A[i] > A[i+1] then
 * swap(A[i], A[i+1])
 * end if
 * end for
 * n = n-1
 * while n > 1
 * end procedure
 */
public class BubbleSort {
    public static void sort(int[] tablica) {
        int n = tablica.length;
        int temp = 0;
        int licznikOperacji = 0;
        do {
            for (int i = 0; i < n - 1; i++) {
                licznikOperacji++;
                if (tablica[i] > tablica[i + 1]) {
                    temp = tablica[i];
                    tablica[i] = tablica[i + 1];
                    tablica[i + 1] = temp;
                }

            }
            n = n - 1;
        } while (n > 1);
        System.out.println("Ilość wykonanych operacji " + licznikOperacji);
    }


}
