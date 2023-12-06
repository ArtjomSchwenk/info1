import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
/**
 * A class to maintain an arbitrarily long list of notes.
 * Notes are numbered for external reference by a human user.
 * In this version, note numbers start at 0.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2008.03.30
 */
public class Notebook
{
    // Storage for an arbitrary number of notes.
    private ArrayList<String> notes;

    /**
     * Perform any initialization that is required for the
     * notebook.
     */
    public Notebook()
    {
        notes = new ArrayList<String>();
    }

    /**
     * Store a new note into the notebook.
     * @param note The note to be stored.
     */
    public void storeNote(String note)
    {
        if ((null == note) || "".equals(note)) return;
        notes.add(note);
    }

    /**
     * @return The number of notes currently in the notebook.
     */
    public int numberOfNotes()
    {
        return notes.size();
    }

    /**
     * Print a note.
     * @param noteNumber The number of the note to be shown.
     */
    public void printNote(int noteNumber)
    {
        if(noteNumber < 0) {
            // This is not a valid note number, so do nothing.
        }
        else if(noteNumber < numberOfNotes()) {
            // This is a valid note number, so we can print it.
            System.out.println(notes.get(noteNumber));
        }
        else {
            // This is not a valid note number, so do nothing.
        }
    }
    
    public String getAll(){
        String x = "";
        String y = "";
        if(notes.size() == 0){
           return "No notes Stored";
        }
        
        for(int i = 0; i < notes.size(); i++){
            x = x + (notes.get(i) + "\n");
            y = y + notes.get(i);
        }
        System.out.print(x);
        return y;
    }
    
    public String getNotesWith(String searchString){
        String x = "";
        String y = "";
        for(int i = 0; i < notes.size(); i++){
            if(searchString.equals(notes.get(i))){
                x = x + (notes.get(i) + "\n");
                y = i + notes.get(i);
            }
        }
        System.out.print(x);
        return y;
    }
    
    public String getAllNumbered(){
        String x = "";
        String y = "";
        if(notes.size() == 0){
           return "No notes Stored";
        }
        
        for(int i = 0; i < notes.size(); i++){
            x = x + (i + notes.get(i) + "\n");
            y = y + i + notes.get(i);
        }
        System.out.print(x);
        return y;
    }
    
    public void removeNotes(String searchString){
        Iterator<String> it = notes.iterator();
        String next;
        
        while(it.hasNext()){
            next = it.next();
            if(next.equals(searchString)){
                it.remove();
            }
        }
    }

    public void removeNotesWithIndex(String searchString){
        for(int i = 0; i < notes.size(); i++){
            if(notes.get(i).equals(searchString)){
                notes.remove(i);
            }
        }
    }
}