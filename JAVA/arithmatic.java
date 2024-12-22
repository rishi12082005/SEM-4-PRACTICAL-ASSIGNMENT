import java.util.Scanner;
public class arithmatic
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = s.nextInt();
        System.out.println("enter b: ");
        int b = s.nextInt();
        int add = a+b;
        System.out.println("addition is : "+add);
    }
}