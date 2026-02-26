import java.util.Scanner;

public class Nod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(evklid(a, b) * evklid(b, a % b));
    }

    public static int evklid(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль невозможно");
        } else if (a == 0 && b < 0) {
            return -b;
        } else if (a == 0 && b > 0) {
            return b;
        } else if (a < b) {
            return evklid(b, a);
        } else {
            while (a % b != 0) {
                int ost = a % b;
                a = b;
                b = ost;
            }
            return b;
        }
    }
}