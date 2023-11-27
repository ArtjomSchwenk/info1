/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
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
     * Construct a Responder - nothing to do
     */
    public Responder(){
        rand = new Random();
        responses = new ArrayList<>();
        map = new HashMap<>();
        fillMap();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
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
    
    private void fillMap(){
        map.put("help", 1);
        map.put("problem", 2);
        map.put("windows", 3);
    }
    
    private void fillResponses() {
        responses.add("Mhm...");
        responses.add("There is no Help, only salvation");
        responses.add("Violence is never the answer, it's the solution");
        responses.add("I use Arch btw");
    }
}
