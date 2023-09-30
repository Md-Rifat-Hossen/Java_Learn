public class Stringdemo{
    public static void main(String[]args)
    {
        String s1="Md Rifat hossen";
        String s2=new String("Md Rifat hossen");
        System.out.println("s1="+s1);
         System.out.println("s2="+s2);
         char [] s3={'a','s','s'};
         System.out.println(s3);
        int n= s1.length();
         System.out.println(n);
         int n1= s2.length();
         //two string is equal or niot  equal
         //if(s1.equals(s2));
         //if(n==n1)
         // if string any change such that lowercase or uppercase
         // this mathod is === 
         //if(s1.equalsIgnorCase(s2))
         //Contains class using for only if any string have to other string 
         if(s1.contains("rifat"))
         {
            System.out.println("Yes");
         }
         else
         {
            System.out.println("No");
         }

    }
}