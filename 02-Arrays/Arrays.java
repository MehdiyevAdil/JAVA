import java.util.Scanner;

public class Arrays {
    static void main() {

        System.out.println("Arrayin olcusunu daxil edin:");
        fillArray(new int[new Scanner(System.in).nextInt()]);

        printArray(fillArray(new int[new Scanner(System.in).nextInt()]));
    }

    static int[] fillArray(int[] array) {
        System.out.println("Arrayi daxil edin:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Reqem daxil edin: " + i + "  -ucun");
            array[i] = new Scanner(System.in).nextInt();

        }
        return array;
    }

    static void printArray(int[] array) {
        if (array == null) {
            System.out.println("Array bosdur");
            return;
        }

        System.out.println("Daxil edilen array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
