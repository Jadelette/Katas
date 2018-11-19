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

   @Test
    public void addsScoreToTotalForOneFrame() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.getTotalScore(3);

        //Then
        Assert.assertEquals(3, result);
    } //end of second test

    @Test
    public void addsScoreForMultipleFrames() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.getTotalScore(3, 5, 7, 9);

        //Then
        Assert.assertEquals(24, result);
    } //end of test 3

    @Test
    public void returnsTotalForASingleFrame() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.getFrameScore(3,5);

        //Then
        Assert.assertEquals(8, result);
    } //end of test 4


    @Test
    public void canCalculateSpare() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.calculateSpare(5);

        //Then
        Assert.assertEquals(15, result);
    } //end of test 5

    @Test
    public void canDetectSpareAndClaculateTotalIfNextRollIsFive() {
        //Given
        Bowling game1 = new Bowling();

        //When
        int result = game1.getFrameScore(1,9);

        //Then
        Assert.assertEquals(15, result);
    }




} //end of class
