package EjerciciosSencillos;

public class MethodChallenge {
    public static void main(String[] args) {


        //Methods
        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Bill", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Mar", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bob", HighScorePosition);

        HighScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Sam", HighScorePosition);
        //Declaration of methods
    }

        public static void displayHighScorePosition(String PlayerName,int HighScorePosition){
            System.out.println(PlayerName + " managed to get into position " +HighScorePosition + " on the high score list");
        }

        public static int calculateHighScorePosition (int PlayerScore){

            if (PlayerScore >= 1000){
                return 1;
            } else if (PlayerScore >= 500 && PlayerScore <= 1000){
                return 2;
            } else if (PlayerScore >= 100 && PlayerScore <= 500){
                return 3;
            } else {
                return 4;
            }
        }



}
