package switchcase;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SwitchExpressionDemo {

    public SwitchExpressionDemo() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Enter a month (1-12): ");
                int month = scanner.nextInt();
                dayOfMonthBlockCode(month);
            } catch (InputMismatchException e) {
                System.out.println("Program exited...");
                break;
            }
        }
    }

    public void dayOfMonthOld(int month) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("This month has 31 days");
                break;
            case 2:
                System.out.println("This month has 28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("This month has 30 days");
                break;
            default:
                System.out.println("Invalid month number");
        }
    }
    public void dayOfMonthNew(int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10,12 -> System.out.println("This month has 31 days");
            case 2 -> System.out.println("This month has 28 or 29 days");
            case 4, 6, 9, 11 -> System.out.println("This month has 30 days");
            default -> System.out.println("Invalid month number");
        }
    }

    public void dayOfMonthBlockCode(int month) {
        Scanner scanner = new Scanner(System.in);
        int days = switch (month) {
            case 1, 3, 5, 7, 8, 10,12 -> 31;
            case 2 -> {
                System.out.println("Enter the year: ");
                int year = scanner.nextInt();
                if(year % 4 == 0)
                {
                    yield 29;
                }else{
                    yield 28;
                }
            }
            case 4, 6, 9, 11 -> 30;
            default -> 0;
        };
        System.out.println("This month has " + days + " days.");
    }
    public static void main(String[] args) {
        new SwitchExpressionDemo();
    }
}
