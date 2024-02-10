public class Main {
    public static void main(String[] args) {
        //Code Blocks And The If Then Else Control Statement
        boolean gameOver = true;
        int score =500;
        int levelCompleted =5;
        int bonus =100;

        if(score<3000 && score >100){
            System.out.println("Your score was less than 300 and greater than 100");
        }
        else if(score>600){
            System.out.println("the score was less than 600");
        }
     else {
         System.out.println("Got here");
        }
    }
}
