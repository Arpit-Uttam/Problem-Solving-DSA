public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10, 1};
        mergeSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void mergeSort(int[] arr) {
       int n= arr.length;
       if(n==1){                                   //base case
        return;
       }
       int[] a =new int[n/2];                      //divide the array into two halves
       int[] b =new int[n-n/2];
       int idx=0;                                   
       for(int i=0;i<a.length;i++){                //copy the elements of the original array into the two halves
        a[i]=arr[idx++];
       }
       for(int i=0;i<b.length;i++){
        b[i]=arr[idx++];
       }
       mergeSort(a);                             //recursively sort the two halves
       mergeSort(b);
       merge(arr,a,b);                         //merge the sorted halves back into the original array

    }
    public static void merge(int[] arr, int[] a, int[] b) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                arr[k++] = a[i++];
            } else {
                arr[k++] = b[j++];
            }
        }
        while (i < a.length) {
            arr[k++] = a[i++];
        }
        while (j < b.length) {
            arr[k++] = b[j++];
        }
    }
}