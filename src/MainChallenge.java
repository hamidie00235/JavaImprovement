public class MainChallenge {
    public static void main(String[] args) {
        //Code Blocks And The If Then Else Control Statement with challenge
        boolean gameOver = true;
        int score =10000;
        int levelCompleted =8;
        int bonus =200;

        int finalScore=score;
        if(gameOver){
            finalScore += (levelCompleted*bonus);
            System.out.println("Your final score is "+finalScore);
        }
    }
}
