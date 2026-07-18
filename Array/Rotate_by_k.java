package Array;

class Rotate_by_k {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int k = 7;
        k=k%n;
        System.out.println("Array before rotation: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        int temp[] = new int[k];
        for(int i=0; i<k; i++){
            temp[i] = arr[i];
        }
        
        for(int i=k; i<n; i++){
            arr[i-k] = arr[i];
        }
        for(int i=0; i<k; i++){
            arr[n-k+i] = temp[i];
        }
        System.out.println("Array after rotation: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

    }
}