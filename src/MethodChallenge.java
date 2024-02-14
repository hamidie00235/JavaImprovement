public class MethodChallenge {
    public static void main(String[] args) {
        int highScorePosition=calculateHighScorePositon(1200);
        displayHighScorePosition("Time" , highScorePosition);
        highScorePosition=calculateHighScorePositon(700);
        displayHighScorePosition("Ali" ,highScorePosition);
        highScorePosition=calculateHighScorePositon(100);
        displayHighScorePosition("Yacoub",highScorePosition);
        highScorePosition=calculateHighScorePositon(70);
        displayHighScorePosition("Hamidie",highScorePosition);

    }
    public static void displayHighScorePosition(String playerName,int highScorePositon){
        System.out.println(playerName + " managed to get into position " + highScorePositon + " on the high score list");
    }
    public static int calculateHighScorePositon(int playerScore){

        int position=0;
        if(playerScore>=1000){

           position=1;
        }
        else if(playerScore>=500 ){
           position= 2;
        }
        else if(playerScore >=100 ){
            position= 3;
        }
      else{
          position=4;
        }
        return position;
    }
}
