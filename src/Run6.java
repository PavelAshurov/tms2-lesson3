/**
 * @author Dzmitry Fursevich
 */
public class Run6 {
    public static void main(String[] args) {
        int[] ar = new int[10];

        int j = 0;
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                ar[j++] = i;
            }
        }

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
