import java.util.Scanner;
public class ArmstrongRange {
    public static void main(String[] args) {
        int i, num, rem, temp, counter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter start number: ");
        int start = sc.nextInt();
        System.out.println("Enter end number: ");
        int end = sc.nextInt();
        for (i = start + 1; i < end; i++) {
            temp = i;
            num = 0;
            while (temp != 0) {
                rem = temp % 10;
                num = num + rem * rem * rem;
                temp = temp / 10;
            }
            if (i == num) {
                if (counter == 0) {
                    System.out.println("armstrong numbers range" + start + " and " + end + ": ");
                }
                System.out.println(i + " ");
                counter++;
            }
            }
            if (counter == 0)
            {
                System.out.println("no armstrong number");
            }
        }
    }


