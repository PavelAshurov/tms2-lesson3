import java.util.Scanner;

/**
 * @author Dzmitry Fursevich
 */
public class Run2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number: ");
        int i = sc.nextInt();
        System.out.println("Number: " + i);

        int[] br = new int[5];
        for (int j = 0; j < br.length; j++) {
            System.out.println("Input array element [" + j + "]:");
            br[j] = sc.nextInt();
        }

        for (int j = 0; j < br.length; j++) {
            System.out.print(br[j] + " ");
        }
    }
}
