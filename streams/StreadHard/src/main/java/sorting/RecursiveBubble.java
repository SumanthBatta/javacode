package sorting;

public class RecursiveBubble {
    public static void main(String[] args) {
        int[] arr = {3,1,56,34,2,7};
        int n = arr.length;
        System.out.println("before sort");
        for (int i : arr){
            System.out.print(i);
        }
        System.out.println();
        bubbleSort(arr,n);
        System.out.println("after sort");
        for(int i : arr){
            System.out.print(i+",");
        }
    }
    public static void bubbleSort(int[] arr, int n){
        if(n==1) return;

        boolean didSwapped=false;
        for(int j = 0; j<=n-2;j++){
            if(arr[j]>arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
                didSwapped=true;
            }
            if(!didSwapped) return;
        }
        bubbleSort(arr,n-1);
    }
}
