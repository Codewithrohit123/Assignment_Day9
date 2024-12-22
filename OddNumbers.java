package Assignment_Day10;
public class OddNumbers {
    public static void main(String[] args) {
        int num = 521;

        do {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
            num--;
        } while (num >= 229);
    }
}
