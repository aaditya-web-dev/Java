import java.util.Scanner;
public class twosum {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elemnts");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        display(arr,n);
        int res[]=twosum(arr,6);
        System.out.println(res[0]+""+res[1]);
        
        
    }

static void display(int arr[],int n)
{
    for(int i=0;i<n;i++)
    {
        System.out.print(" "+arr[i]); 
    }

}

static int[] twosum(int arr[],int target)
{
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i]+arr[j]==target)
            {
                int arr1[]={i,j};
                return arr1;
            }
            
        }
        
    }
    return new int[]{-1, -1};

}
}
