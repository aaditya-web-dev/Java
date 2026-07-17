class insertionsort
{
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
         for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        
        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp)
            {
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=temp;
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
    }
}