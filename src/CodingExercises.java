public class CodingExercises {
    public static void main(String[] args) {
        checkNumber(0);

    }
    // Exercice de codage 1 : Positive, Negative or Zero
    public static void checkNumber(int number){

        if(number>0){
            System.out.println("positive");
        }
        else if(number<0){
            System.out.println("negative");
        }
       else{
            System.out.println("zero");
        }
    }
}

