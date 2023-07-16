import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arraySize = new int[]{1, 2, 3};
        double[] Size = {1.57, 7.654, 9.986};
        int[] arrayNumber = new int[]{15, 55, 0, 5196, 8198};
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arraySize = new int[]{1, 2, 3};
        double[] Size = {1.57, 7.654, 9.986};
        int[] arrayNumber = new int[]{15, 55, 0, 5196, 8198};
        for (int i = 0; i < arraySize.length; i++) {
            System.out.print(arraySize[i]);

            if (i != arraySize.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < Size.length; i++) {
            System.out.print(Size[i]);

            if (i != Size.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i]);

            if (i != arrayNumber.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arraySize = new int[]{1, 2, 3};
        double[] Size = {1.57, 7.654, 9.986};
        int[] arrayNumber = new int[]{15, 55, 0, 5196, 8198};
        for (int i = arraySize.length - 1; i >= 0; i--) {
            System.out.print(arraySize[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = Size.length - 1; i >= 0; i--) {
            System.out.print(Size[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = arrayNumber.length - 1; i >= 0; i--) {
            System.out.print(arrayNumber[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] arraySize = new int[]{1, 2, 3};
        double[] Size = {1.57, 7.654, 9.986};
        int[] arrayNumber = new int[]{15, 55, 0, 5196, 8198};

        for (int i = 0; i < arraySize.length; i++) {

            if (arraySize[i] % 2 != 0) {
                arraySize[i]++;
            }
        }
        System.out.println(arraySize);
        System.out.println(Arrays.toString(arraySize));
    }
}
