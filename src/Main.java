public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static int[] generateRandomArray(){
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        int[] arr = generateRandomArray();
        int totalWaste = 0;
        for (int j : arr) {
            totalWaste = totalWaste + j;
        }
        System.out.println("Сумма трат за месяц составила: " + totalWaste + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int minWaste = 200000000;
        int maxWaste = 0;
        for (int j : arr) {
            if (maxWaste < j) {
                maxWaste = j;
            }
            if (minWaste > j) {
                minWaste = j;
            }
        }
        System.out.println("Минимальная сумма трат за день составила: " + minWaste + " рублей");
        System.out.println("Максимальная сумма трат за день составила: " + maxWaste + " рублей");
        }
    public static void task3(){
        int[] arr = generateRandomArray();
        int totalWaste = 0;
        for (int j : arr) {
            totalWaste = totalWaste + j;
        }
        float averageWaste = (float) (totalWaste / 30);
        System.out.println("Средняя сумма трат за месяц составила: " + averageWaste + " рублей");
    }
    }
