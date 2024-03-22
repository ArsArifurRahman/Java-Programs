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

    public static void main(String[] args) {
        Main main = new Main();

        for (int i = 1; i <= 100; i++) {
            if (main.iterativeCheckPrime(i))
                System.out.print(i + " ");
        }
    }
}