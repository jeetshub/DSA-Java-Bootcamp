import java.util.Scanner;
public class max {
    public static void main(String[] args) {
        Scanner ino = new Scanner(System.in);
        int a = ino.nextInt();
        int b = ino.nextInt();
        int c = ino.nextInt();
        
        /*  Method 1
            int max = a;
        if(b > max) {
            max = b; 
        }
        if(c > max){
            max = c;
        }
        System.out.println(max); */

        /* Method 2 */
        int max = Math.max(c, Math.max(a,b));
        System.out.println(max);
        ino.close();
    } 
}
