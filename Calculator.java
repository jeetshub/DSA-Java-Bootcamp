import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        System.out.println("Basic Calculator");
        Scanner var = new Scanner(System.in);
        /* Taking Input from the user */
        System.out.println("Enter the first number");
        float num1 = var.nextFloat();
        System.out.println("Enter the second number");
        float num2 = var.nextFloat();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Substraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        System.out.println("Choose the operations above");
        int option = var.nextInt();
        if (option == 1) {
            System.out.println(num1+num2);
        } else if (option == 2) {
            System.out.println(num1-num2);
        } else if (option == 3) {
            System.out.println(num1*num2);
        } else if (option == 4) {
            System.out.println(num1/num2);
        }
        var.close();
    }
}
