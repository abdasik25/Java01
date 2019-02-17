import java.util.Scanner;

public class VarSwap{

   public static void Swap (int a, int b){
      System.out.println("a = " + a + " b = " + b);
      a = a ^ b;
      b = a ^ b;
      a = a ^ b;
      System.out.println("a = " + a + " b = " + b);
   }

   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter 2 vars: ");
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      VarSwap.Swap(a,b);
   }
}
