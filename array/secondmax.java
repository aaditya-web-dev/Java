import java.util.Scanner;

public class secondmax {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter in array:");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();

        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

        }

        secondmax(arr);

    }
    static void secondmax(int arr[])
    {
        int max=arr[0];
        int s_max=arr[1];
        if(arr[0]>arr[1])
        {
            max=arr[0];
            s_max=arr[1];
        }
        else
        {
            max=arr[1];
            s_max=arr[0];
        }

        for(int i=2;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                s_max=max;
                max=arr[i];
            }
            else if(arr[i] > s_max && arr[i] !=max)
            {
                s_max=arr[i];
            }
        }
        System.out.println("max:"+max+" s_max"+s_max);
    }
}
