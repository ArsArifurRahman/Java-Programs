public class Main {

    public void iterativeFactors(int number) {
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                System.out.print(i + " ");
        }
    }

    public void recursiveFactors(int number, int index) {
        if (index <= number) {
            if (number % index == 0) {
                System.out.print(index + " ");
            }
            recursiveFactors(number, index + 1);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.iterativeFactors(100);
        System.out.print("\n");
        main.recursiveFactors(100, 1);
    }
}