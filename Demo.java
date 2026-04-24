// check palindrome number
public class Demo {
    public static void main(String[] args) {
        int num = 12321;
        int originalNum = num;
        int reversedNum = 0;

        while (num > 0) {
            int digit = num % 10; // Get the last digit
            reversedNum = reversedNum * 10 + digit; // Append the digit to the reversed number
            num /= 10; // Remove the last digit
        }

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome number.");
        } else {
            System.out.println(originalNum + " is not a palindrome number.");
        }
    }
}