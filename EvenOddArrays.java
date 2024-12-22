package Assignment_Day10;
import java.util.Scanner;

public class EvenOddArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int[] evenArr = new int[10]; 
        int[] oddArr = new int[10];
        int evenIndex = 0, oddIndex = 0;

        System.out.println("Enter 10 elements:");
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArr[evenIndex++] = num;
            } else {
                oddArr[oddIndex++] = num;
            }
        }

        System.out.print("Even elements: ");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evenArr[i] + " ");
        }
        System.out.println();

        System.out.print("Odd elements: ");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(oddArr[i] + " ");
        }
    }
}
