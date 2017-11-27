import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

/**
 * Write a description of class IndexEntry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IndexEntry
{
    // instance variables - replace the example below with your own
    private String word;
    private ArrayList <Integer> numsList;

    /**
     * Constructor for objects of class IndexEntry
     */
    public IndexEntry(String input)
    {
        // initialise instance variables
        word = input.toUpperCase();
        numsList = new ArrayList <Integer> ();
    }
    public void add(int num)
    {
        // put your code here
        if(!numsList.contains(num)){
            numsList.add(num);
        }
    }
    public String getWord()
    {
        // put your code here
        return word;
    }
    public String toString()
    {
        // put your code here
        
        //StringBuffer num = new StringBuffer();
        //INSERT CODE THAT SETS NUM TO THE VALUE OF word + ""
        //for(int i = 0; i < numsList.size(); i++){
        //    num.append(i);
         //   num.append(", ");
        //}
       // String numString = num.toString();
       
       //not using a StringBuffer as using the toString() method may confuse the compiler
        String numString = word + " ";
        for(int i = 0; i < numsList.size(); i++){
            numString += i + ", "; 
        }
        numString = numString.substring(0, numString.length() - 2);
        return numString;
        
    }
    
}
