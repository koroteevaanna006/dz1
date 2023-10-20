import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int a = scanner.nextInt();
            int i = scanner.nextInt();

            int mask = ~((1 << i) - 1);
            int result = a & mask;

            System.out.println(result);
        }
    }






public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        boolean result;

        if (x > 0 && x % 5 == 0 && x >= 100 && x <= 999) {
            result = true;
        } else {
            result = false;
        }

        System.out.println(result);
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int input;

        do {
            input = scanner.nextInt();

            if (input >= 10 && input <= 99) {
                int tensDigit = input / 10;
                int unitsDigit = input % 10;
                sum += tensDigit + unitsDigit;
            }
        } while (input >= 10 && input <= 99);

        System.out.println(sum);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int minOddDigit = -1;
        while (N > 1) {
            int digit = N % 10;
            if (digit % 2 == 1) {
                if (minOddDigit == -1 || digit < minOddDigit) {
                    minOddDigit = digit;
                }
            }

            N /= 10;
        }

        if (minOddDigit == -1) {
            System.out.println("NO");
        } else {
            System.out.println(minOddDigit);
        }
    }
}

