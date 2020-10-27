import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int height = scanner.nextInt();
        int bridges = scanner.nextInt();
        boolean crashed = false;

        for (int i = 1; i <= bridges; i++) {
            int bridge = scanner.nextInt();

            if (bridge <= height) {
                crashed = true;
                System.out.println("Will crash on bridge " + i);
                break;
            }
        }

        if (!crashed) {
            System.out.println("Will not crash");
        }
    }
}