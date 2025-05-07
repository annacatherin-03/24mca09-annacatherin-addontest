
package question01;
import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int n = scanner.nextInt();
if (n % 2 == 0) {
            System.out.println("Please enter an odd number.");
            return;
        }
int mid = (n + 1) / 2;
        for (int i = 1; i <= mid; i++) {
            printStars(i);
            
        }
for (int i = mid - 1; i >= 1; i--) {
            printStars(i);
        }

    }
private static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("* ");
        }
        System.out.println();
        
    }
}
