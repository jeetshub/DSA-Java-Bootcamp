import java.util.Scanner;
public class SI {
    public static void main(String[] args) {
        System.out.println("Simple Interest Calculator");
        /*  ab is the object of the class scanner to take the input */
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the principle amount");
        float Principle = ab.nextFloat();
        System.out.println("Enter the Rate of interest");
        float Rate = ab.nextFloat();
        System.out.println("Duration period details");
        //  Duratrion Consists of months & years
        System.out.println("Enter number of months");
        int months = ab.nextInt();
        System.out.println("Enter number of years");
        int years = ab.nextInt();
        // This is the Total time
        float Time = years + (months/12);
        //  Simple Interest Calculation
        float si = (Principle*Rate*Time)/100;
        System.out.println("The required simple interest is "+ si);
        // This function closes the object ab
        ab.close();
    }
}