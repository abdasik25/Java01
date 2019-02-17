import java.util.Scanner;

public class InchesToCentimeters{

    public static void Convert(double distance){
       System.out.println(distance + " inches is " + distance/0.394D + " centimeters");
    }

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter distance in inches:");
       double distance = scanner.nextDouble();
       InchesToCentimeters.Convert(distance);
    }
}
