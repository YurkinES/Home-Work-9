import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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
        for (int i = 0; i < arr.length; i++) {
            totalWaste = totalWaste + arr[i];
        }
        System.out.println("Сумма трат за месяц составила: " + totalWaste + " рублей");
    }
    public static void task2() {
        int[] arr = generateRandomArray();
        int minWaste = 200000000;
        int maxWaste = 0;
        for (int i = 0; i < arr.length; i++) {
            if(maxWaste < arr[i]){
                maxWaste = arr[i];
            }
            if (minWaste > arr[i]) {
                minWaste = arr[i];
            }
            }
        System.out.println("Минимальная сумма трат за день составила: " + minWaste + " рублей");
        System.out.println("Максимальная сумма трат за день составила: " + maxWaste + " рублей");
        }
    }
