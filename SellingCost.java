import java.util.Scanner;

public class SellingCost{

    public static void CountCost(int sweetsMass, double sweetsCost, int jellyMass, double jellyCost){

        System.out.println("1KG of sweets costs " + sweetsCost/sweetsMass + "BYN");
        System.out.println("1KG of jelly costs " + jellyCost/jellyMass + "BYN");
        System.out.println("Jelly " + ((sweetsCost/sweetsMass) / (jellyCost/jellyMass)) +
                " times more expensive than sweets");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mass of sweets (KG): ");
        int sweetsMass = scanner.nextInt();
        System.out.println("Enter cost of sweets (for "  + sweetsMass+ "KG): ");
        double sweetsCost = scanner.nextDouble();
        System.out.println("Enter mass of jelly (KG): ");
        int jellyMass = scanner.nextInt();
        System.out.println("Enter cost of jelly (for "  + jellyMass + "KG): ");
        double jellyCost = scanner.nextDouble();
        SellingCost.CountCost(sweetsMass, sweetsCost, jellyMass, jellyCost);
   }
}
