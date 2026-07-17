package Array;

/**
 * Second_L_Element
 */
public class Second_L_Element {
    public static void main(String[] args) {

        int[] arr = {3,2,1,5,2};

        int n = arr.length;
        int largest = arr[0];
    
        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }

        int sLargest = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>sLargest && arr[i]!=largest){
                sLargest=arr[i];
            }
        }
        System.out.println(sLargest);
    }
}