package bubbleSort;

import java.util.Scanner;

/**
 *
 * @author omPiko
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a[];
        Scanner in = new Scanner(System.in);
        System.out.print("input long array: ");
        int longIndexArray = in.nextInt();
        a = new String[longIndexArray];
        for (int i = 0; i < a.length; i++) {
            System.out.print("input string: ");
            a[i] = in.next();
        }
        processBubble.bubble(a);
    }
}
