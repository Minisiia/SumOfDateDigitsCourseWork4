import java.util.Scanner;

public class SumOfDateDigitsCourseWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть дату у форматі dd/mm/yyyy:");
        String date = scanner.next();
        System.out.println(sumOfNumbers(date));

    }
    static int sumOfNumbers (String stringDate) {
        int sum = 0;
        char [] arrayDate = stringDate.toCharArray();
        for (int i = 0; i < arrayDate.length; i++) {
            if (arrayDate[i] != '/') {
                sum += Character.getNumericValue(arrayDate[i]);
            }
        }
        return sum;
    }
}
