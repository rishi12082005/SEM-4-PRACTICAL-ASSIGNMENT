import java.util.*;
public class Ifelse_1 {
    public static void main (String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = sc.nextInt();
        if(age > 18)
        {
            System.out.println("Adult");
        }
        else{
            System.out.println("not Adult");
        }
    }

}