import javax.sound.midi.Soundbank;

public class Lesson3 {
    static void main() {

        for (int a = 1; a <= 5; a++) {

            // ulduzlar
            for (int i = 1; i <= a; i++) {
                System.out.print("*");
            }

            // boşluqlar
            for (int j = 1; j <= 5 - a; j++) {
                System.out.print(" ");
            }

            //  xett
            System.out.println(" ");
        }

        for (int i = 0; i < 5; i++) {


        }
    }
}