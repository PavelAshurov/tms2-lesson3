/**
 * @author Dzmitry Fursevich
 */
public class Run {
    public static void main(String[] args) {
        int[] ar = new int[10];

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        int[] ar2 = new int[]{1, 3, 0, 5};
        for (int i = 0; i < ar2.length; i++) {
            System.out.print(ar2[i] + " ");
        }
        System.out.println();

        for (int i = ar2.length - 1; i >= 0; i--) {
            System.out.print(ar2[i] + " ");
        }
    }
}
