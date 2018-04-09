import java.util.Arrays;

/**
 * Created by ppomorsk on 09/04/2018.
 */
public class Main {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] tablicaLiczb = new int[]{1,2,3,5,6,10,0,4};


        System.out.println("Nieposortowana tablica:");
        System.out.println(Arrays.toString(tablicaLiczb));

        System.out.println("\nPosorotwana tablica:");
        bubbleSort.sort(tablicaLiczb);
        System.out.println(Arrays.toString(tablicaLiczb));


    }
}
