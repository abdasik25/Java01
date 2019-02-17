import java.util.Scanner;

public class ByteConverter{

    public static void CountSize(double size){
      System.out.println("Size = " + (float) size/1024 +" KB = " + (float) size/(1024*1024) +
              " MB = " + (float) size/(1024*1024*1024) + " GB");
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter file size (in bytes): ");
        double size = scanner.nextDouble();
        ByteConverter.CountSize(size);
    }
}
