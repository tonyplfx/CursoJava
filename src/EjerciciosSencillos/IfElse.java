package EjerciciosSencillos;

public class IfElse {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
        boolean newgameOver = true;
        int newscore = 800;
        int newlevelCompleted = 5;
        int newbonus = 100;

        int newfinalScore = score;

        if (gameOver){
            newfinalScore += (newlevelCompleted * newbonus);
            System.out.println("Your final score was: " + newfinalScore);
        }
    }
}
