package fizzbuzz;

public class FizzBuzzWithTests {

    public static void main(String[] args) {
        FizzBuzzWithTests fizzBuzz = new FizzBuzzWithTests();

        for (int i = 1; i <=100; i++) {
        System.out.println(fizzBuzz.translateNumber(i));
        }
    }

    public String translateNumber(int number) {

        boolean isFizz = number%3==0;
        boolean isBuzz = number%5==0;
        boolean isFizzBuzz = isFizz&&isBuzz;

        if (isFizzBuzz){
            return "fizzbuzz.FizzBuzz";
        }

        else if(isFizz) {

            return "Fizz";

        } else if (isBuzz){
            return "Buzz";
        }

        else {
            return String.valueOf(number);

            //Homework: test and add new requirements. use .contains(). Change number to string and check if has 3 or 5
        }
    }
}
