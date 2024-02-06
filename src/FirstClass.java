public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an Alien");
        }

        int topScore = 60;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }
        int secondTopScore=39;
        if((topScore>secondTopScore) && (topScore<100)){
            System.out.println("you got greater than secondTopScore and less than 100");

        }
        if((topScore>80)||(secondTopScore<90)){
           System.out.println("either or both conditions are true");
        }
        //Assignment operator vs equals to operator
        int newValue=50;
        if(newValue==50){
            System.out.println("this is true");
        }
        boolean isCar =false;
        if(!isCar){
            System.out.println("this is correct");

        }
        if(!isCar){
            System.out.println("this is equivalent to  isCar =false");

        if(isCar==true){
            System.out.println("this is not supposed to happen yani condition wrong");

        }

        if(isCar){
            System.out.println("this i same as isCar ==true ");

        }
            if(isCar=true){
                System.out.println("this is not supposed to happen  ");

            }


        }
    }}


