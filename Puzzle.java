import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Puzzle {

    public ArrayList<Integer> tenRandomNumbers(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            Random randomNumber = new Random();
                list.add(randomNumber.nextInt());
                // System.out.println(list);
        };
                // System.out.println("Number -->" + list);
                return list;
    };
    //---------------------------------

    public char randomLetters(){
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        char letter;

        Random randomLetterIndex = new Random();
        letter = alphabet[randomLetterIndex.nextInt(26)];
        // System.out.println("Letter --> " + letter);
        return letter;
    };
    //---------------------------------

    public String passwordGenerator(){
        Random randomLetterIndex = new Random();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Character> passwordArr = new ArrayList<Character>(); 
        String password = "";
        char letter;

        for(int i = 0; i < 10; i++){
            letter = alphabet[randomLetterIndex.nextInt(26)];
            passwordArr.add(letter);
            password += passwordArr.get(i);
        }
        
        return password;
    };
    //---------------------------------

    public ArrayList<Integer> shuffle(){
        ArrayList<Integer> shuffledArr = new ArrayList<Integer>();

        for (int i = 1; i < 11; i++) {
            shuffledArr.add(i);
        };

        Collections.shuffle(shuffledArr);
        return shuffledArr;
    };

};