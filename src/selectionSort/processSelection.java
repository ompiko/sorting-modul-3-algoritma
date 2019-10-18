package selectionSort;
/**
 *
 * @author omPiko
 */
public class processSelection{
    static void selection(String zz[]){
        for (int i = 0; i < zz.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < zz.length; j++) {
                if (zz[j].compareTo(zz[minIndex])<0) {
                    minIndex = j;
                }
            }
            String temp = zz[minIndex];
            zz[minIndex] = zz[i];
            zz[i] = temp;
        }
        System.out.print("after sort: ");
        for (int i = 0; i < zz.length; i++) {
            System.out.print(zz[i]+" ");
        }
    }
}