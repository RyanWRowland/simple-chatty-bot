import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String shape = scanner.nextLine();
        switch (shape) {
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                double r = scanner.nextDouble();
                area = 3.14 * (r * r);
                System.out.println(area);
                break;
            default:
                System.out.println("invalid shape");
        }
    }
}