package fizzbuzz;

public class FizzBuzzWithTests {

    public static void main(String[] args) {
        FizzBuzzWithTests fizzBuzz = new FizzBuzzWithTests();

        for (int i = 1; i <=100; i++) {
        System.out.println(fizzBuzz.translateNumber(i));
        }
    }

    public String translateNumber(int number) {

        String numberString = String.valueOf(number);
        boolean isFizz = number%3==0 || numberString.contains("3");
        boolean isBuzz = number%5==0 || numberString.contains("5");
        boolean isFizzBuzz = isFizz && isBuzz;


        if (isFizzBuzz){
            return "FizzBuzz";
        }

        else if(isFizz) {

            return "Fizz";

        } else if (isBuzz){
            return "Buzz";
        }

        else {
            return String.valueOf(number);

        }
    }
}
