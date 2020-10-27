import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        for (int i = x; i <= y; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println((i % 3 == 0 && i % 5 == 0) ? "FizzBuzz" : i % 3 == 0 ? "Fizz" : "Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}