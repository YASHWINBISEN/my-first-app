package Array;

public class duplicate {
    public static void main(String[] args){

        int []arr = {1,1,2,2,2,3,3};
        int n = arr.length;
        int i=0;
        System.out.println("Before removing duplicate: ");
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+",");
        }
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println();
        System.out.println("After removing duplicate: ");

        for(int k=0;k<n;k++){
            System.out.print(arr[k]+",");
        }
        System.out.println();
        System.out.println(arr[i+1]);

    }
}
