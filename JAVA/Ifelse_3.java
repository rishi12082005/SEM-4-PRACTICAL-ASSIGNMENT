import java.util.*;
public class Ifelse_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a:");
        int a = sc.nextInt();
        System.out.println("enter b:");
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println("A is greater then B");
        }
        else if(b>a)
        {
            System.out.println("B is greater then A");
        }
        else
        {
            System.out.println("A and B both are equal");
        }
    }
}
