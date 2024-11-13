import java.util.Random;

// First thread generates a random integer every one second
class RandomNumberGenerator extends Thread {
    public void run() {
        Random random = new Random();
        while (true) {
            int num = random.nextInt(100); // Generates a random integer between 0 and 99
            System.out.println("Generated number: " + num);

            // Check if the number is even or odd
            if (num % 2 == 0) {
                // If even, square it using the second thread
                new SquareCalculator(num).start();
            } else {
                // If odd, cube it using the third thread
                new CubeCalculator(num).start();
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

// Second thread computes the square of the number and prints
class SquareCalculator extends Thread {
    private int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int square = number * number;
        System.out.println("Square of " + number + " is: " + square);
    }
}

// Third thread computes the cube of the number and prints
class CubeCalculator extends Thread {
    private int number;

    CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        int cube = number * number * number;
        System.out.println("Cube of " + number + " is: " + cube);
    }
}

public class MultiThreadedRandomNumber {
    public static void main(String[] args) {
        // Start the first thread to generate random numbers
        RandomNumberGenerator rng = new RandomNumberGenerator();
        rng.start();
    }
}
