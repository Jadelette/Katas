package bowling;

import org.junit.Test;
import org.junit.Assert;

public class BowlingTest {

    @Test
    public void returns0ForTotalWhenNoRolls() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.getTotalScore();

        //Then
        Assert.assertEquals(0, result);

    }//end of test







} //end of class
