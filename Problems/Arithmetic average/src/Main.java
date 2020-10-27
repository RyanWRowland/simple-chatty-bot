import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double sum = 0;
        double count = 0;
        int i = a - (a % 3);

        if (i < a) {
            i += 3;
        }

        for (; i <= b; i += 3) {
            sum += i;
            count++;
        }

        System.out.println(sum / count);
    }
}