import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your birth year: ");
        int year = scanner.nextInt();
        System.out.println("Enter your birth month: ");
        int month = scanner.nextInt() - 1;
        System.out.println("Enter your birth day: ");
        int day = scanner.nextInt();

        Calendar currentDate = Calendar.getInstance();
        Calendar birthDate = Calendar.getInstance();
        birthDate.set(year, month, day);

        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);
        System.out.println("You are " + age + " years old.");
        scanner.close();
    }
}