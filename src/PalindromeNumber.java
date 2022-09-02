import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        int rem, s,t,reverse=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input n= ");
        int num= sc.nextInt();
        t=num;
        for(s=0;num>0;num/=10) {
            rem = num % 10;
            s = (s * 10) + rem;
        }
        if(s==t)
            System.out.println("number is palindrome");
        else
            System.out.println("not palindrome");
    }
}

