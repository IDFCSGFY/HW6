public class Main {
    public static void main(String[] args) {
        //1
        System.out.println("#1\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //2
        System.out.println("\n#2\n");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        //3
        System.out.println("\n#3\n");
        for (int i = 0; i <= 17; i += 2) {
            System.out.println(i);
        }

        //4
        System.out.println("\n#4\n");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        //5
        System.out.println("\n#5\n");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным.");
        }

        //6
        System.out.println("\n#6\n");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }

        //7
        System.out.println("\n#7\n");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.println(i);
        }

        //8
        System.out.println("\n#8\n");
        int sum = 0, monthly = 29000;
        for (int i = 1; i <= 12; i++) {
            sum += monthly;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sum + " рублей");
        }

        //9
        System.out.println("\n#9\n");
        float sumInBank = 0;
        float interest = 1.01f;
        for (int i = 1; i <= 12; i++) {
            sumInBank *= interest;
            sumInBank += monthly;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumInBank + " рублей");
        }

        //10
        System.out.println("\n#10\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + (2 * i));
        }
    }
}
