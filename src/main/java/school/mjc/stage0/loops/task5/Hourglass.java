package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        // Needs refactor
        for (int i = 0; i < (height % 2 == 0 ? height / 2 : height / 2 + 1); i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < height - (i * 2); j++) {
                System.out.print(8);
            }

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }

        for (int i = height / 2; i > 0; i--) {

            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < height - i * 2 + 2; j++) {
                System.out.print(8);
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }


    }
}
