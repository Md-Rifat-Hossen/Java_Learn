import java.util.Scanner;
public class Prime {
    public static void main(String[]agrs)
    {
        Scanner input=new Scanner(System.in);
        int n;
        n=input.nextInt();
        int cout=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                cout++;break;
            }

        }
        if(cout==0)
        {
            System.out.println("This  number is prime number");
        }
        else
        System.out.println("This number is not prime number");

    }
    
}
