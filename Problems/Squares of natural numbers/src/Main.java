import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int i = 1;
        int squared = i * i;
        while (squared <= n) {
            System.out.println(squared);
            i++;
            squared = i * i;
        }
    }
}