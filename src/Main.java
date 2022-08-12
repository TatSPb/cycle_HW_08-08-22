public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("ЗАДАНИЕ 1 ");
        int i = 1;
        while (i < 11) {
            System.out.print(i++ + " ");
        }
        System.out.println(" ");
        for (int a = 10; a > 0; a = a-1) {
            System.out.print(a + " ");
        }
    }

    public static void task2() {
        System.out.println("\n");
        System.out.println("ЗАДАНИЕ 2 ");
        int friday = 5;
        for (friday = 5;  friday< 31; friday = friday + 7) {
            System.out.println("Сегодня пятница, " + friday + "-e число. Необходимо подготовить отчет.");
        }
    }
    public static void task3() {
        System.out.println();
        System.out.println("ЗАДАНИЕ 3");
        int currentYear = 2022;
        int pastYear = currentYear - 200;
        int futureYear  = currentYear + 100;
        int period = 79;

        for (int year = pastYear; year <= futureYear; year++) {
            if (year % period ==0) {
                System.out.println(year);
            }
        }
    }
}