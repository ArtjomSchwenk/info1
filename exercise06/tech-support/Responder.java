/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes.
 * @version    0.1 (2016.02.29)
 */
import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
public class Responder
{
    private Random rand;
    private ArrayList<String> responses;
    private HashMap<String, Integer> map;
    
/**
 * The responder Method creates a rand variable that is implemented 
 * with the Random() method. An ArrayList and a HashMap are created
 * and filled with the corresponding fillMethods coming up later.
 * 
 * @author Artjom Schwenk, Daniel Antropow, Christan Paust and Anton Basjukoff
 */
    public Responder(){
        rand = new Random();
        responses = new ArrayList<>();
        map = new HashMap<>();
        fillMap();
        fillResponses();
    }

    /**
     * The generateResponse() method takes the input of the support
     * system and splits it by " " and  stores the Strings in an Array
     * called words. Words are then compared to the keys of the HashMap
     * map. A Integer value is then parsed to the response ArrayList,
     * when a word matches a key.
     */
    public String generateResponse(String input) {
        String[] words = input.split(" ");
        
        for(int i = 0; i < words.length; i++){
            if(map.containsKey(words[i])){
                return responses.get(map.get(words[i]));
            }
        }
        return responses.get(0);
    }
    
    /**
     * Fills the HashMap with Keys that are the trigger words and
     * values that are Integer numbers that work as indexes for
     * the responses ArrayList.
     */
    private void fillMap(){
        map.put("help", 1);
        map.put("problem", 2);
        map.put("windows", 3);
        map.put("answer", 4);
        map.put("where", 5);
        map.put("why", 6);
        map.put("can", 7);
    }
    
    /**
     * Fills the ArrayList with responses that are printed out
     * from the tech support system
     */
    private void fillResponses() {
        responses.add("Mhm...");
        responses.add("There is no Help, only salvation");
        responses.add("Violence is never the answer, it's the solution");
        responses.add("I use Arch btw");
        responses.add("42");
        responses.add("I'm not google maps");
        responses.add("Just because");
        responses.add("Nah i dont feel like doing that");
    }
}
