import java.util.Scanner;

public class Dinosaur{

    public static void CountMass(int mass){
      System.out.println("Mass = " + (float) mass/1000 +"KG = " + (float) mass/100_000 +
              "C = " + (float) mass/1_000_0000 + "T");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dinosaur mass (in grams): ");
        int mass = scanner.nextInt();
        Dinosaur.CountMass(mass);
    }
}
