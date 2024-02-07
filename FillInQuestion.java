
/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by '_'.
 *   For Example, "The inventor of Java is _James Gosling_." The question should be
 *   displayed as: "The inventor of Java is ____________."
 *
 * @author mrcallaghan
 * @version 07feb2024
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of, is derived from) the
 *      Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare teh instance variables text and answer!
     * 
     * The text and answer instance variables are inherited from the Question class.
     */
    
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text and answer.
     */
    /*
     * Use the @Override annotation when overriding a mehtod to signal to the complier
     *  to verify that you are in fact overriding the method.
     */
    @Override
    public void setText(String questionText)
    {
            
    }
    
}







