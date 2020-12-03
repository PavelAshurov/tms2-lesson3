/**
 * @author Dzmitry Fursevich
 */
public class Run5 {
    public static void main(String[] args) {
        int[] ar = new int[]{1, 4, 1};

        for (int e : ar) {
            System.out.print(e + " ");
        }

        System.out.println();
        for (int i = 0; i < ar.length; i++) {
            System.out.println("Элемент в индексе " + i + " равен " + ar[i]);
        }
    }
}
