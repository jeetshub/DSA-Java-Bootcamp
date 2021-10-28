import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sx = new Scanner(System.in);
        System.out.println("Enter number 1");
        int a = sx.nextInt();
        System.out.println("Enter number 2");
        int b = sx.nextInt();
        int sum = a + b;
        System.out.println("The sum of these numbers is");
        System.out.println(sum);
        sx.close(); 
    }
}