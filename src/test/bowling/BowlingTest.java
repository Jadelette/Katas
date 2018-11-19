package bowling;

import org.junit.Test;
import org.junit.Assert;

public class BowlingTest {

    @Test
    public void returns0ForTotalWhenNoRolls() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.getTotal();

        //Then
        Assert.assertEquals(0, result);

    }//end of test

    @Test
    public void canCalculateTotalForOneRoll() {
        //Given
        Bowling game1 = new Bowling();
        game1.roll(3);

        //When
        int result = game1.getTotal();

        //Then
        Assert.assertEquals(3, result);

    }//end of test

    @Test
    public void canCalculateTotalForMultipleRolls() {
        //Given
        Bowling game1 = new Bowling();
        game1.roll(3, 5);

        //When
        int result = game1.getTotal();

        //Then
        Assert.assertEquals(8, result);

    }//end of test


} //end of class
