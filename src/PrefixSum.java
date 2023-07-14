import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }
        findPrefixSum(array,size);
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
    public static void findPrefixSum(int array[],int size)
    {
        int p=array[0];
        for(int i=1;i<size;i++)
        {
            array[i] = p + array[i];
            p=array[i];
        }
    }
}
