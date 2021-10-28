import java.util.Scanner;
public class alphabetcomp {
    public static void main(String[] args) {
        Scanner var = new Scanner(System.in);
        /* trim() removes the extra spaces from the string input which we have taken.
        charAt(0) shows the zeroth position of the string */
        char ch = var.next().trim().charAt(0);
        if ( ch >= 'a' && ch <= 'z') {
            System.out.println("Lower case");
        } else if ( ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper case");
        }
        var.close();
    }
    
}
