public class Main {

    public boolean iterativeCheckPrime(int number) {
        if (number < 2)
            return false;
        else if (number == 2)
            return true;
        else if (number % 2 == 0)
            return false;
        else {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0)
                    return false;
            }
        }

        return true;
    }

    public boolean recursiveCheckPrime(int number, int index) {
        if (number < 2)
            return false;
        else if (number == index)
            return true;
        else if (number % index == 0)
            return false;

        return recursiveCheckPrime(number, index + 1);
    }

    public static void main(String[] args) {
        Main main = new Main();

        for (int i = 1; i <= 100; i++) {
            if (main.iterativeCheckPrime(i))
                System.out.print(i + " ");
        }

        System.out.print("\n");

        for (int i = 1; i <= 100; i++) {
            if (main.recursiveCheckPrime(i, 2))
                System.out.print(i + " ");
        }
    }
}