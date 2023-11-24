/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
import java.util.Random;
import java.util.ArrayList;
public class Responder
{
    private Random rand;
    private ArrayList<String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder(){
        rand = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = rand.nextInt(responses.size());
        return responses.get(index);
    }
    
    private void fillResponses() {
        responses.add("That sounds odd. Could you describe \n" +
        "that problem in more detail?");
        responses.add("No other customer has ever \n" +
        "complained about this before. \n" +
        "What is your system configuration?");
        responses.add("That’s a known problem with Vista." +
        "Windows 7 is much better.");
        responses.add("I need a bit more information on that.");
        responses.add("Have you checked that you do not \n" +
        "have a dll conflict?");
        responses.add("That is explained in the manual. \n" +
        "Have you read the manual?");
        responses.add("Your description is a bit \n" +
        "wishy-washy. Have you got an expert \n" +
        "there with you who could describe \n" +
        "this more precisely?");
        responses.add("That’s not a bug, it’s a feature!");
        responses.add("Could you elaborate on that?");
    }
}
