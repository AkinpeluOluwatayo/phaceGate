import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter four digit number: ");
        int input = scanner.nextInt();

        int d1 = num / 1000;
        int d2 = (num / 100) % 10;
        int d3 = (num / 10) % 10;
        int d4 = num % 10;

        
        d1 = (d1 + 7);
        d2 = (d2 + 7);