import java.util.*;

public class BubbleSortDecending {
    public static void main(String args[]) {
        int arr[] = { 4, 6, 3, 5, 2 };

        // bubble sort in Decending order
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    //swaping
                    /*int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;*/
                    //or
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
