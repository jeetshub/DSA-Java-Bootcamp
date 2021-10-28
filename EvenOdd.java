import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
        System.out.println("Even Odd Number finder");
        System.out.println("Please Enter a number to proceed");
        Scanner ax = new Scanner(System.in);
        int a = ax.nextInt();
        if (a%2==0) {
            System.out.println("The given number is even");
        } else {
            System.out.println("The given number is odd");
        }
        ax.close();
    }
}