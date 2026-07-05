import java.util.Scanner;

class binarysearch
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        
        System.out.println("enter the value to search");
        int target=sc.nextInt();

        

        // display(arr);
        int res=binarysearch(arr,target);
        if(res==-1)
        {
            System.out.println("not found");
        }
        else{
            System.out.println("found at index "+res);
        }
        
    }
    static void display(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }

    }
    static int binarysearch(int arr[],int target)
    {
        int left=0;
        int right=arr.length-1;
        

        while(left<=right)
        {
            int mid=(left+right)/2;
            if (arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return -1;

    }



}