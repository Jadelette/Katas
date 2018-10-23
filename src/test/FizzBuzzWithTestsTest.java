import org.junit.Test;
import org.junit.Assert;

public class FizzBuzzWithTestsTest {

    //Arrange  --- Given
    //Act      --- When
    //Assert   --- Then


    @Test
    public void returnsFizzIfDivisibleBy3() {
        //Given
        FizzBuzzWithTests fizz = new FizzBuzzWithTests();

        //When
        String result = fizz.translateNumber(3);

        //Then
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void returnsNumberIfNotDivisibleBy3() {
        //Given
        FizzBuzzWithTests fizz = new FizzBuzzWithTests();

        //When
        String result = fizz.translateNumber(7);

        //Then
        Assert.assertEquals("7", result);
    }

    @Test
    public void returnsBuzzIfDivisibleBy5() {
        //Given
        FizzBuzzWithTests fizz = new FizzBuzzWithTests();

        //When
        String result = fizz.translateNumber(5);

        //Then
        Assert.assertEquals("Buzz", result);
    }

    @Test
    public void returnsFizzBuzzIfDivisibleBy3And5() {
        //Given
        FizzBuzzWithTests fizz = new FizzBuzzWithTests();

        //When
        String result = fizz.translateNumber(15);

        //Then
        Assert.assertEquals("FizzBuzz", result);
    }


}
