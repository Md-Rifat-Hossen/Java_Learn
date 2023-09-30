public class Stringdem03 {
    public static void main(String[]args)
    {
        String country="  This is my country  ";
        //Now using CharAt methode for index of string char;
        char ch=country.charAt(0);
        System.out.println(ch);
        //Now using codePointAt method for return asky value;
        int value=country.codePointAt(2);
        System.out.println(value);
        //now using indexOf for spacefiy char for decelear string
        int pos=country.indexOf('c');
        System.out.println(pos);
        //now using trim mathod for removing space first and last of declear string;
        String s1=country.trim();
        System.out.println(s1);
        //now using replace of string
        String s2=s1.replace('i', 'T');
        System.out.println(s2);
        //now split method using for any king of space or char 
        // String [] s3=s1.split( " ");
        
        // if(String c:s3)
        // {
        //     System.out.println(c);
        // }



    }
    
}
