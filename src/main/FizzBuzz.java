public class FizzBuzz {


    /**
     *
     * if a number is divisible by three replace it with 'fizz'
     * if a number is divisible by five replace it with 'buzz'
     *
     *Count to 100
     *
     * Create a counter variable - initialise to one
     * make it count to 100 by creating a loop that increments it by one each time and prints out
     *
     * before printing
     * check if number is divisible by 3
     * if it is print fizz and return to start of loop
     *
     * check if number is divisible by 5 and if so replace with Buzz and start loop over.
     *
     * Check if it is divisible by both and print 'FizzBuzz!' if so.
     * */


    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            boolean isFizz = i%3==0;
            boolean isBuzz = i%5==0;
            boolean isFizzBuzz = isFizz && isBuzz;

            if (isFizzBuzz) {
                System.out.println("FizzBuzz!");
            } else if (isFizz) {
                System.out.println("Fizz!");

            } else if (isBuzz) {
                System.out.println("Buzz!");

            } else {

                System.out.println(i);
            }
        }
    }

}

