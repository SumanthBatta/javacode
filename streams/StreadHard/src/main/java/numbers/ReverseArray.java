package numbers;

import javax.swing.plaf.synth.SynthUI;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("hii");
        Thread.sleep(3000);
        System.out.println("hlo" );
        int[] arr = {12,3,45,6,76};
        int i = 0; int j = arr.length-1;
        while(i<j){
            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i]= tmp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
