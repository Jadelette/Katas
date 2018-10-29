package potter;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class PotterTest {

    @Test
     public void testsIfBasketTotalCalculatedAllItemsFullPrice() {
        //Given
        Potter potter = new Potter();

        //When
        ArrayList<String> basket = new ArrayList<>();
        basket.add("Volume 1");
        basket.add("Volume 1");
        basket.add("Volume 2");
        basket.add("Volume 2");
        basket.add("Volume 3");
        basket.add("Volume 3");
        basket.add("Volume 4");
        basket.add("Volume 4");

        int result = potter.calculateBasketTotal(basket);

        //Then
        Assert.assertEquals(64, result);
    }

    @Test
    public void testsIfVolumesAreDistinguishedAndGrouped(){
        //Given
        Potter potter = new Potter();

        //When
        ArrayList<String> basket = new ArrayList<>();
        basket.add("Volume 1");
        basket.add("Volume 1");
        basket.add("Volume 2");
        basket.add("Volume 2");
        basket.add("Volume 3");
        basket.add("Volume 3");
        basket.add("Volume 4");
        basket.add("Volume 4");

        int result = potter.calculateBasketTotal(basket);

        //Then

    }




}