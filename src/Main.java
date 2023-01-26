public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int hoard = 15_000;
        int total = 0;
        int a = 0;
        while (total < 2_459_000) {
            a = a + 1;
            total = total + hoard;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей.");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int a = 0;
        while (a < 10) {
            a = a + 1;
            System.out.print(" " + a + " ");
        }
        System.out.println();
        int b = 10;
        for (; b > 0; b--) {
            System.out.print(" " + b + " ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        float birthRate = (float) 17/1000;
        float deathRate = (float) 8/1000;
        int year = 0;
        while (year < 10) {
            year++;
            population = (int)(population + (population * birthRate) - (population * deathRate));
            System.out.println("Год " + year + ". Численность населения составляет " + population + " человек.");
        }
        System.out.println("Через 10 лет численность населения будет составлять " + population + " человек.");

    }

    public static void task4() {
        System.out.println("Задача 4");
        double sum = 15_000;
        double percent = 0.07;
        for (int a = 1; sum <= 12_000_000; a++) {
            sum = sum * (1 + percent);
            System.out.printf("Месяц " + a + ", сумма накоплений равна %.1f рублей. %n", sum);
            System.out.println("Для накопления необходимой суммы потребуется " + a + " месяцев.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        double sum = 15_000;
        double percent = 0.07;
        int a = 0;
        for (; sum <= 12_000_000; a++) {
            sum = sum * (1 + percent);
            if (a % 6 == 0) {
                System.out.printf("Месяц " + a + ", сумма накоплений равна %.1f рублей. %n", sum);
            }
        }
        System.out.println("Для накопления необходимой суммы потребуется " + a + " месяцев.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        double sum = 15_000;
        double percent = 0.07;
        int nineYears = 12 * 9;
        for (int a = 1; a <= nineYears; a++) {
            sum = sum * (1 + percent);
            if (a % 6 == 0) {
                System.out.printf("Месяц " + a + ", сумма накоплений равна %.2f рублей. %n", sum);
            }
        }
        System.out.printf("За 9 лет сумма накоплений равна %.2f рублей. %n", sum);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 3;
        do {
            System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
            firstFriday = firstFriday + 7;
        }
        while (firstFriday <= 31);
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2023;
        int a = currentYear + 100;
        int b = currentYear - 200;
        for (int c = 0; c < a; c++) {
            if (c > b && c % 79 == 0) {
                System.out.println(c);
            }
        }
    }
}
