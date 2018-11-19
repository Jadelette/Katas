package bowling;

public class Bowling {

    private int total = 0;

    public void roll(int... rolls) {
        for(int roll : rolls) {
            total += roll;
        }
    }

    public int getTotal() {
        return total;
    }
}
