import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\ua028892\\Desktop\\input.txt"));
            String line;
            String s = reader.readLine();
            int firstNumber = Integer.parseInt(s);
            int i = 0;
            while ( i<firstNumber ) {
                line = reader.readLine();
                int number = Integer.parseInt(line);
                if (isPrime(number)) {
                    System.out.println(number + " Prime");
                } else {
                    System.out.println(number + " Not Prime");
                }
                i++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
