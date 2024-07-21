package EjerciciosSencillos;

public class methods {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelComplete = 5;
        int bonus = 100;


        int highScore = calculateScore(gameOver, score, levelComplete, bonus);
        System.out.println("Your Highscore is " + highScore);

        score = 10000;
        levelComplete = 8;
        bonus = 200;
        System.out.println("The next highscore is " +
        calculateScore(gameOver, score, levelComplete, bonus));

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        int finalScore = score;

        if (gameOver){
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }
        return finalScore;
    }
}
