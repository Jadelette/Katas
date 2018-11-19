package bowling;

public class Bowling {

    public static void main(String[] args) {

            }

    public static int calculateSpare(int nextRollAfterSpare) {
        int spareFrameTotal = 10 + nextRollAfterSpare;
        return spareFrameTotal;
    }

    public int getFrameScore(int rollOne, int rollTwo) {

        int frameTotal = rollOne + rollTwo;

        if (frameTotal==10) {
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
