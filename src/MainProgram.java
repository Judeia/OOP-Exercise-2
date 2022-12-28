 public class MainProgram {

     public static void main (String[] args){
     Birds bird;
     Songbird oscines = new Songbird ("Oscines", "4-5 cm", "Passerfomes");
     Ducks duckling = new Ducks    (" Duckling", " 26 inches", "Domestic duck");            


     bird = oscines;
     System.out.println(" Name of the songbird: " + bird.getName() + "\nSound: " + bird.MakeSound() + "\nSize: " + bird.getSize() + "\n" );           
     bird = duckling;
     System.out.println(" Name of the duck: " + bird.getName() + "\nSound: " + bird.MakeSound() + "\nSize: " + bird.getSize() + "\n");

    }







}
