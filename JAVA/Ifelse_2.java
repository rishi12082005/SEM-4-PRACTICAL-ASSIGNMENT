import java.util.*;
public class Ifelse_2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the nummber to check weather it is odd or even: \n");
            int a = sc.nextInt();
            if (a % 2 == 0)
            {
                System.out.println(" "+a+ " is even number");
            }
            else
            {
                System.out.println(" "+a+ " is odd number");
            }
        }
}
