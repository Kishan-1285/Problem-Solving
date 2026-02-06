public class smallest_largest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,8,5,6,7};
        int largest = arr[1];
        int smallest = arr[1];
        
        for(int i=0;i<arr.length;i++){
            if(largest<arr[i]){
                largest = arr[i];
            }
            if(smallest>arr[i]){
                smallest = arr[i];
            }
            
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}

