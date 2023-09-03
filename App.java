import static java.lang.System.out;
import java.util.ArrayList;

public class App {

    public static void main(String[] args){

        out.println("<----Running App---->");
        
        //Instance
        Puzzle tenRandomNumberArray = new Puzzle();
        Puzzle randomLetter = new Puzzle();
        Puzzle passwordGeneration = new Puzzle();
        Puzzle shuffledArrayList = new Puzzle();

        //Method Calls
        out.println("Number --> " + tenRandomNumberArray.tenRandomNumbers());
        out.println("Letter --> " + randomLetter.randomLetters());
        out.println("Password --> " + passwordGeneration.passwordGenerator());
        out.println("Shuffled Result --> " + shuffledArrayList.shuffle());

    }

}