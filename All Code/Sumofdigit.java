import java.util.Scanner;
public class Sumofdigit {
    public static void main(String[]agrs)
    {
        Scanner input=new Scanner(System.in);
        int num=input.nextInt();
        int sum=0;
                int sum1=0,sum2=0;

        int temp= num;
        while(temp!=0)
        {
            int r=temp%10;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println(sum);
        int temp1=num;
        while(temp1!=0)
        {
            int r1=temp1%10;
            sum1=sum1*10+r1;
            temp1=temp1/10;
        }
         System.out.println(sum1);
         if(sum1==num)
         {
            System.out.println("This number is peledrom");
         }
         else
         {
            System.out.println("This number is not pleridrom");
         }

         //prottek digit ar numbrr jodi ghono korar pore ekoi digit hoy ahole amongstrom number bole
         int temp2=num;
        while(temp2!=0)
        {
            int r2=temp2%10;
            sum2=sum2+r2*r2*r2;
            temp2=temp2/10;
        }
         System.out.println(sum2);
         if(sum2==num)
         {
            System.out.println("This number is Amnstrom");
         }
         else
         {
            System.out.println("This number is not Amnstrong");
         }

    }
    
}
