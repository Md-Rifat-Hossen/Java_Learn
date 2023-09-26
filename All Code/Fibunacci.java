import java.util.Scanner;
public class Fibunacci {
    public static void main (String[]agrs)
    {
        Scanner input=new Scanner(System.in);
        int n =input.nextInt();
        int first=0;
        int scound=1;
        int fibo;
        System.out.print(first+" "+scound);
        for(int i=3;i<=n;i++)
        {
            fibo=first+scound;
            System.out.print(" "+fibo);
            first=scound;
            scound=fibo;
        }

    }
    
}
