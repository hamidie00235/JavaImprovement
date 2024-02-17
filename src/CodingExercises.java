public class CodingExercises {

    public static void main(String[] args) {



         CodingExercises speedConverter =new CodingExercises();
 speedConverter.printConversion(1.5);
 speedConverter.printConversion(10.25);
        speedConverter.printConversion(-5.6);
        speedConverter.printConversion(25.42);
        speedConverter.printConversion(75.114);


//        checkNumber(0);
//
//    }
//    // Exercice de codage 1 : Positive, Negative or Zero
//    public static void checkNumber(int number){
//
//        if(number>0){
//            System.out.println("positive");
//        }
//        else if(number<0){
//            System.out.println("negative");
//        }
//       else{
//            System.out.println("zero");
//        }
    }
        // Exercice de codage 2:speed converter
        public static long toMilesPerHour(double kilometersPerHour){

            // invalid option part
            if (kilometersPerHour<0){
                return -1;
            }
           // convert the value from kilometers to miles per hour
           long miles =Math.round(kilometersPerHour/1.609);
           return miles;


    }
      public static void printConversion(double kilometersPerHour){
        // invalid option
          if(kilometersPerHour<0){
              System.out.println("Invalid value");
              return;
          }

          // calculate from kilometres to miles per hour
          long conversion =toMilesPerHour(kilometersPerHour);
          System.out.println(kilometersPerHour + " km/h = " + conversion + " mi/h ");
      }
}

