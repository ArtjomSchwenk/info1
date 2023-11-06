import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AmPmDisplayKara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmPmDisplayKara extends DigitDisplayKara
{
    public AmPmDisplayKara(int rollOverLimit, long placeValue, int stepsToNextDigit){
        super(rollOverLimit, placeValue, stepsToNextDigit);
    }
    /**
     * Act - do whatever the AmPmDisplayKara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public String getDisplayText(int count){
        if (count == 1)
            return "AM";
        return "PM";
        
    }
}
