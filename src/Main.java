import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    static void main() {
       /* System.out.println("a-ni daxil wedin:");
        double a=new Scanner(System.in).nextDouble();

        System.out.println("b-ni daxil wedin:");
        double b=new Scanner(System.in).nextDouble();

        System.out.println("emeliyyaTI daxil edin: ( + - * / )   ");
        char operation=new Scanner(System.in).nextLine().charAt(0);

        if (operation=='+'){
            System.out.println(a+b);
        } else if (operation=='-') {
            System.out.println(a-b);
        } else if (operation=='*') {
            System.out.println(a*b);
        } else if (operation=='/') {
            System.out.println(a/b);
        }else {
            System.out.println("Emeliyyat yalnisdir ( + - * / )   ");
        }*/

//        System.out.println("a-ni daxil wedin:");
//        double a=new Scanner(System.in).nextDouble();
//
//        System.out.println("b-ni daxil wedin:");
//        double b=new Scanner(System.in).nextDouble();
//
//        System.out.println("emeliyyaTI daxil edin: ( + - * / )   ");
//        char operation=new Scanner(System.in).nextLine().charAt(0);
//
//        switch (operation){
//            case '+'-> System.out.println(a+b);
//            case '-'-> System.out.println(a-b);
//            case '*'-> System.out.println(a*b);
//            case '/'-> System.out.println(a/b);
//            default -> System.out.println("invalid operation");
//
//        System.out.println("Hansi soz capa verilsin:");
//        String soz=new Scanner(System.in).nextLine();
//
//        System.out.println("Neqeder capa verilsin: ");
//        int neceDefe=new Scanner(System.in).nextInt();
//
//        for (int i=0;i<neceDefe;i++){
//            System.out.println(soz);
//        }
//        for (int j=0;j<3;j++) {
//            for (int i = 0; i < 5; i++) {
//                if(i==2){
//                    System.out.print("=");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println(" ");
//        }

        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 5; i++) {
                if (i == 2) {
                    System.out.print("=");
                    continue;
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
