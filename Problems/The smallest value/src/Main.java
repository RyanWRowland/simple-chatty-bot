import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();

        long fact;
        int n = 0;
        do  {
            fact = 1;
            n++;
            for (int i = n; i > 0; i--) {
                fact *= i;
            }
        } while (fact <= m);

        System.out.println(n);
    }
}