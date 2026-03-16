import java.util.*;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Error: Division by zero or invalid input");
        } 
    }
}
