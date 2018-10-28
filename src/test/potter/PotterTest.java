package potter;

import potter.Potter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PotterTest {

    @Test
     public void testsIfBasketTotalCalculatedAllItemsFullPrice() {
        //Given
        Potter potter = new Potter();

        //When

        ArrayList<String> basket = new ArrayList<String>();
        basket.add(0, "Volume 1");
        basket.add(1, "Volume 1");
        basket.add(2, "Volume 2");
        basket.add(3, "Volume 2");
        basket.add(4, "Volume 3");
        basket.add(5, "Volume 3");
        basket.add(6, "Volume 4");
        basket.add(7, "Volume 4");

        int result = potter.calculateBasketTotal(basket);

        //Then
        Assert.assertEquals(64, result);
    }

    @test
    public void testsIfVolumesAreDistinguishedAndGrouped(){
        //Given
        Potter potter = new Potter();

        //When

        ArrayList<String> basket = new ArrayList<String>();
        basket.add(0, "Volume 1");
        basket.add(1, "Volume 1");
        basket.add(2, "Volume 2");
        basket.add(3, "Volume 2");
        basket.add(4, "Volume 3");
        basket.add(5, "Volume 3");
        basket.add(6, "Volume 4");
        basket.add(7, "Volume 4");

        int result = potter.calculateBasketTotal(basket);

        //Then

    }




}