public class INsertionSort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 1, 2 };

        // Loop for unsorted part.in starting we asume that Index 0 is Sorted and
        // another index is Unsorted.
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
           int j = i-1;
           while(j>= 0 && current<arr[j]){
               arr[j+1]=arr[j];
               j--;
           }

           //place
           arr[j+1]=current;
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
