import java.util.Scanner;

public class CityDistance{

    public static void CountDistance(double distance){
      System.out.println("Distance = " + (float) distance/100 +"M = " + (float) distance/1000_000 + "KM");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance between 2 cities (in centimeters): ");
        double distance = scanner.nextDouble();
        CityDistance.CountDistance(distance);
    }
}
