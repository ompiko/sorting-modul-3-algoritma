package bubbleSort;

/**
 *
 * @author omPiko
 */
public class processBubble {
    static void bubble(String zz[]){
        System.out.println("after sort: ");
        for (int i = 0; i < zz.length; i++) {
            for (int j = i+1; j < zz.length; j++) {
                if (zz[i].compareTo(zz[j]) > 0) {
                    String temp = zz[j];
                    zz[j] = zz[i];
                    zz[i] = temp;
                } 
            }
            System.out.print(zz[i]+" ");
        }
    }
}
