public class MainChallenge {
    public static void main(String[] args) {
//        //Code Blocks And The If Then Else Control Statement with challenge
//        boolean gameOver = true;
//        int score =10000;
//        int levelCompleted =8;
//        int bonus =200;
//
//        int finalScore=score;
//        if(gameOver){
//            finalScore += (levelCompleted*bonus);
//            System.out.println("Your final score is "+finalScore);


        //Methods in java
        calculationScore(true,5,8,100);

        calculationScore(true,10000,8,200);

    }
        public static void calculationScore(boolean gameOver,int score,int levelCompleted,int bonus){
           int finalScore = score;
            if(gameOver){
                finalScore += (levelCompleted*bonus);
                finalScore +=1000;
                System.out.println("your score is "+finalScore);
            }
        }
    }

