import java.util.Random;
import java.util.Scanner;

/**
 * @author Dzmitry Fursevich
 */
public class Run3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        Random rnd = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = rnd.nextInt(50);
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
