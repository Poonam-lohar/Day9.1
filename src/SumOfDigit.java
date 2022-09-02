import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int a = sc.nextInt();
        int sum = 0,digit;
        while (a > 0) {
            digit = a % 10;
            sum = sum + digit;
            a = a / 10;
        }
            System.out.println("Sum of digits : "+sum);
        }
    }
