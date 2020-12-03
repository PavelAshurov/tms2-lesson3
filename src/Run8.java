import java.util.Arrays;

/**
 * @author Dzmitry Fursevich
 */
public class Run8 {
    public static void main(String[] args) {
        int[] ar = new int[]{44, 26, 24, 7, 46, 27, 1, 27, 13, 24};

        Arrays.sort(ar);

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
