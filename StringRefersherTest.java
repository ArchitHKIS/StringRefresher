
/**
 * Write a description of class StringRefersherTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringRefersherTest
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringRefersherTest
     */
    public static void main()
    {
        printChars("Hamlet");
        System.out.println(locateChar("Hamlet", 'e'));
        System.out.println(replaceStr("Hamlet", "amle", "o"));        
    }
    public StringRefersherTest()
    {
        // initialise instance variables

    }

    public static void printChars(String inputStr)
    {
      for (int i=0; i<inputStr.length(); i++)
      {
        System.out.println(inputStr.charAt(i));
      }
    }
    
    public static int locateChar(String inputStr, char targetChar)
    {
        for (int i=0; i<inputStr.length(); i++)
        {
            if (inputStr.charAt(i) == targetChar)
            {
                return i;
            }            
        }
        return -1;
    }
    
    public static String replaceStr(String inputStr, String targetChar, String replaceStr)
    {
        return inputStr.replace(targetChar, replaceStr);
    }  
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
