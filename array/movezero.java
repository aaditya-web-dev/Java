import java.util.Scanner;

public class movezero {
    public static void main(String[] args) {
        int arr[];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size");
        n=sc.nextInt();

        arr=new int[n];

        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        move(arr,n);
        System.out.print("elements:");
        for(int i=0;i<n;i++)
        {
            System.out.print( arr[i]);
        }




    }
    static void move(int [] arr,int n)
    {
        int i=0;
        for(int j=0;j<n;j++)
        {
            if(arr[j]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;

            }
        }

            
    }
    
}
