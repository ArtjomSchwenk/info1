import greenfoot.*;
import java.util.List;
import java.util.ArrayList;
/**
 * MirrorKara is a subclass of Kara. Therefore, it inherits all methods of Kara: <p>
 * 
 * <i>MirrorKara ist eine Unterklasse von Kara. Sie erbt damit alle Methoden der Klasse Kara:</i> <p>
 * 
 * Actions:     move(), turnLeft(), turnRight(), putLeaf(), removeLeaf() <b>
 * Sensors:     onLeaf(), treeFront(), treeLeft(), treeRight(), mushroomFront()
 */
public class MirrorKara extends Kara
{
    /**
     * In the 'act()' method you can write your program for Kara <br>
     * <i>In der Methode 'act()' koennen die Befehle fuer Kara programmiert werden</i>
     */
    
     public void act() 
    {
        move();
        mirrorRow();
        if (treeFront())
            Greenfoot.stop();
    }  

    public void mirrorRow(){
        turnLeft();
        List<Boolean> row = scanRow();
        layRow(row);
        turnRight();
    } 
    
    private List<Boolean> scanRow(){
        List<Boolean> path = new ArrayList<>();
        
        for(int i=0;i<14;i++){
            move();
            if(onLeaf() == true)
                path.add(true);
            else
                path.add(false);
        }
        
        turnRight();
        turnRight();
        move(14);
        return path;
    }
    
    public void layRow(List<Boolean> row){
        for(int i=0;i<14;i++){
            move();
            if(row.get(i).equals(true))
                putLeaf();
        }
        
        turnRight();
        turnRight();
        move(14);
    }
}
