public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + a + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int max = 200_000;
        int min = 100_000;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
            if (arr[i] > min) {
                min = arr[i];
            }
            System.out.println("Максимальная сумма трат за день составила " + min + " рублей");
            System.out.println("Минимальная сумма трат за день составила " + max + " рублей");
        }
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        float a = 0;
        for (int i = 0; i < arr.length; i++) {
            a = a + arr[i];
        }
        a = a/arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + a + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i>=0;i--) {
            System.out.print(reverseFullName[i]);
        }


    }
}
