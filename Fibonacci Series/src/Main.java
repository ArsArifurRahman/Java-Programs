public class Main {

    public void iterativeFibonacciSeries(int number) {
        int first = 0, second = 1, next;

        for (int i = 0; i < number; i++) {
            if (i <= 1)
                next = i;
            else {
                next = first + second;
                first = second;
                second = next;
            }

            System.out.print(next + " ");
        }
    }

    public int recursiveFibonacciSeries(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;

        return recursiveFibonacciSeries(number - 1) + recursiveFibonacciSeries(number - 2); // recursively calling the fibonacc() function and then adding them
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.iterativeFibonacciSeries(10);

        System.out.print("\n");

        for (int i = 0; i < 10; i++) {
            System.out.print(main.recursiveFibonacciSeries(i) + " ");
        }
    }
}