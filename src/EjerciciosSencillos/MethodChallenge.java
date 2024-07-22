package EjerciciosSencillos;

public class MethodChallenge {
    public static void main(String[] args) {


        //Methods
        int HighScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", HighScorePosition);

        //Declaration of methods
    }

        public static void displayHighScorePosition(String PlayerName,int HighScorePosition){
            System.out.printf(PlayerName + " managed to get into position " +HighScorePosition + " on the high score list");
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
