import java.util.Scanner;
class selectionsort{
public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.println("enter size:");
    int n=in.nextInt();
    int arr[]=new int[n];
    for (int i = 0; i < n;i++)
{
      arr[i]=in.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
       int min=i;
       for(int j=i+1;j<arr.length;j++)
       {
        if(arr[j]<arr[min]){
            min=j; 
        }
            int temp=arr[j];
            arr[j]=arr[min];
            arr[min]=temp;
    }
}
    for(int i=0;i<arr.length;i++)
    {
        System.out.println(arr[i]+" ");
    }

in.close();
}
}