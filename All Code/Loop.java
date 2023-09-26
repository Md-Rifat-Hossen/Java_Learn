import java.util.Scanner;

public class Loop{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
           
        }
         System.out.println("This is sum : "+sum);
         for(int i=1;i<=n;i++)
        {
            sum=sum+i;
           
        }
         System.out.println("This is sum : "+sum);
    }
}