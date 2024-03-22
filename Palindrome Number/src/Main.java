public class Main {

    public boolean checkPalindrome(int number) {
        int reverse = 0, remainder, copy;

        copy = number;

        while (copy != 0) {
            remainder = copy % 10;
            reverse = reverse * 10 + remainder;
            copy /= 10;
        }

        return number == reverse;
    }

    public static void main(String[] args) {
        Main main = new Main();

        if (main.checkPalindrome(11211))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}