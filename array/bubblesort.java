public class bubblesort {
    public static void main(String[] args) {
        int arr[]={2,0,1,0,3,0,0,5,6};
        
        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr.length-1; k++) {
                if(arr[k]>arr[k+1])
                {
                    arr[k]=arr[k+1]+arr[k];
                    arr[k+1]=arr[k]-arr[k+1];
                    arr[k]=arr[k]-arr[k+1];

    
                }
                
            }

            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
            
        }
    }
}
