import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};

        int n=arr.length;
        Scanner sc =new Scanner(System.in);
        int val;
        System.out.println("enter val to find");
        val=sc.nextInt();

        int a=linearsearch(arr,val);
        if(a!=-1)
        {
            System.out.println("value at index:"+a);
        }
        else{
            System.out.println("not found");
        }

    }

    static int linearsearch(int arr[],int val)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==val)
            {
                return i;
            }
          
        }
        return -1;

    }
    
}
