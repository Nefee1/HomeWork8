
public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] arraySize = new int[3];
        arraySize[0] = 1;
        arraySize[1] = 2;
        arraySize[2] = 3;

        float[] Size = {1.57f, 7.654f, 9.986f};

        int[] arrayNumber = new int[5];
        arrayNumber[0] = 157;
        arrayNumber[1] = 55;
        arrayNumber[3] = 5196;
        arrayNumber[4] = 8198;
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] arraySize = new int[3];
        arraySize[0] = 1;
        arraySize[1] = 2;
        arraySize[2] = 3;

        float[] Size = {1.57f, 7.654f, 9.986f};
        Size[0] = 1.57f;
        Size[1] = 7.654f;
        Size[2] = 9.986f;

        int[] Number = new int[5];
        Number[0] = 157;
        Number[1] = 55;
        Number[3] = 5196;
        Number[4] = 8198;
        System.out.println(" 1 Массив " + arraySize[0] + "," + arraySize[1] + "," + arraySize[2]);
        System.out.println(" 2 Массив " + Size[0] + "," + Size[1] + "," + Size[2]);
        System.out.println(" 3 Массив " + Number[0] + "," + Number[1] + "," + Number[3] + "." + Number[4]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] arraySize = new int[3];
        arraySize[0] = 1;
        arraySize[1] = 2;
        arraySize[2] = 3;

        float[] Size = {1.57f, 7.654f, 9.986f};
        Size[0] = 1.57f;
        Size[1] = 7.654f;
        Size[2] = 9.986f;

        int[] Number = new int[5];
        Number[0] = 157;
        Number[1] = 55;
        Number[3] = 5196;
        Number[4] = 8198;
        System.out.println(" 1 Массив " + arraySize[2] + "," + arraySize[1] + "," + arraySize[0]);
        System.out.println(" 2 Массив " + Size[2] + "," + Size[1] + "," + Size[0]);
        System.out.println(" 3 Массив " + Number[4] + "," + Number[3] + "," + Number[1] + "." + Number[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] arraySize = new int[3];
        arraySize[0] = 1;
        arraySize[1] = 2;
        arraySize[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(arraySize[i]);
            arraySize[0] += 1;
            arraySize[1] += 1;
            arraySize[2] += 1;// Учитель я не понял как добавить +1 внуторь массива
        }
    }
}