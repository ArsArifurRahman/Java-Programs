public class Main {

    public long iterativeFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public long recursiveFactorial(int number) {
        if (number < 0)
            return 0;
        else if (number == 0)
            return 1;

        return number * recursiveFactorial(number - 1);
    }

    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.iterativeFactorial(5));
        System.out.println(main.recursiveFactorial(5));
    }
}