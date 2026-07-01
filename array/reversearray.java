public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.print("Original array:");
        display(arr,n);
        

        reverseArray(arr, n);


        System.out.print("Reversed array:");
        display(arr,n);
    
    }
    public static void display(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void reverseArray(int arr[],int n)
    {
        int left=0;
        int right=n-1;
        int temp;
        while(left<=right)
        {
            temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }

    
}