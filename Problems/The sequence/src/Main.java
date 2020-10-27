import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numElements = scanner.nextInt();
        int count = 0;
        int max = 0;

        while(count < numElements) {
            int element = scanner.nextInt();

            if (element % 4 == 0 && element > max) {
                max = element;
            }

            count++;
        }

        System.out.println(max);
    }
}