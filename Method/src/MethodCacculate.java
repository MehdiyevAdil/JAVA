import java.util.Scanner;

public class MethodCacculate {
    public static void main(String[] args) {
        System.out.println(Calculate());
    }


    public static double toplama(double a, double b) {
        double netice = a + b;
        return netice;
    }

    public static double cixma(double a, double b) {
        double netice = a - b;
        return netice;
    }

    public static double bolme(double a, double b) {
        double netice = a / b;
        return netice;
    }

    public static double vurma(double a, double b) {
        double netice = a * b;
        return netice;
    }


    public static double Calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-ni daxil wedin:");
        double a = sc.nextDouble();
        System.out.println("b-ni daxil wedin:");
        double b = sc.nextDouble();
        sc.nextLine(); // ENTER-i udur ??
        System.out.println("emeliyyati daxil wedin:  ( + - * / )  ");
        char opr = sc.nextLine().charAt(0);// setiri tam oxu ve setirin 0-ci indexsindeki simvolu al
        double cavab = 0;
        if (opr == '+') {
            cavab = toplama(a, b);
        } else if (opr == '-') {
            cavab = cixma(a, b);
        } else if (opr == '/') {
            cavab = bolme(a, b);
        } else if (opr == '*') {
            cavab = vurma(a, b);
        } else {
            System.out.println("Yalnis emeliyyat daxil etdiniz");
        }
        return cavab;
    }
}
