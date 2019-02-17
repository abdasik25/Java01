import java.util.Scanner;

public class Triangle{

    public static boolean isTriangle(int a, int b, int c){
       return ((a + b > c) && (a + c > b) && (b + c > a));
    }

   public static void main (String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter sides of the triangle: ");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
       int c = scanner.nextInt();
       System.out.println("a = " + a + " b = " + b + " c = " + c + "\nIs it a triangle? "
             + (Triangle.isTriangle(a,b,c) ? "Yes" : "No"));
   }
}
