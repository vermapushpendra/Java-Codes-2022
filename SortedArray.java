public class SortedArray {
    public static boolean printSorted(int arr[],int idx){
        if(idx == arr.length -1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            //array is sorted till now
            return printSorted(arr, idx+1);

        }else{
            return false;
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,3,5,4};
        System.out.println(printSorted(arr, 0));

    }
    
}
