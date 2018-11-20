package bowling;

public class Bowling {

    public static void main(String[] args) {

        Bowling game1 = new Bowling();

        int frameTotal = game1.bowlAFrame();

        System.out.println(frameTotal);

            }


        public int bowlAFrame() {
            double rollOnePins = Math.random() * 11;
            int rollOnePinsInt = ((int) rollOnePins);
            if (rollOnePinsInt == 10) {
                System.out.println("Strike");
                return rollOnePinsInt;
            } else {
                System.out.println("Roll 1: You knocked down " + rollOnePinsInt + " pins");
                double rollTwoPins = Math.random() * (11 - rollOnePins);
                int rollTwoPinsInt = ((int) rollTwoPins);
                int scoreFromTwoRolls = rollOnePinsInt + rollTwoPinsInt;
                if (scoreFromTwoRolls == 10) {
                    System.out.println("Spare");
                } else {
                    System.out.println("Roll 2: You knocked down " + rollTwoPinsInt + " pins");
                }
                return scoreFromTwoRolls;
            }
        }

    public static int calculateStrike(int addToStrike) {
        int spareFrameTotal = 10 + addToStrike;
        return spareFrameTotal;
    } //end of calculate strike

    public static int calculateSpare(int nextRollAfterSpare) {
        int spareFrameTotal = 10 + nextRollAfterSpare;
        return spareFrameTotal;
    } //end of calculate spare

    public int getFrameScore(int rollOne, int rollTwo) {

        int frameTotal = rollOne + rollTwo;

        if (rollOne == 10) {
            frameTotal = Bowling.calculateStrike(8);

        }else if (frameTotal==10) {
            frameTotal = Bowling.calculateSpare(5); //need to create method to determine next roll score
        }
        return frameTotal;
    }//end of getFrameScore


    public int getTotalScore(int... gameScores) {

        int totalScore = 0;

        for (int frameTotal : gameScores) {
                totalScore += frameTotal;
        }

        return totalScore;
    } // end of get total score method



} //end of class
