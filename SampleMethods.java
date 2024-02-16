public class SampleMethods {

    // Method with conditional statement (if-else)
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    // Method with loop (for)
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Method with switch statement
    public static String dayOfWeek(int day) {
        String dayName;
        switch (day) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
        }
        return dayName;
    }

    // Method with while loop
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Testing the methods
        System.out.println("Max of 5 and 7: " + max(5, 7));
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Day of the week for 3: " + dayOfWeek(3));
        System.out.println("Sum of digits of 123: " + sumOfDigits(123));
    }
}

