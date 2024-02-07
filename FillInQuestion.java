
/**
 * A FillInQuestion is constructed with a string taht contains the answer surrounded '_'. For example,
 *  "The inventor of Java was _James Gosling_."  The question should be displayed as "The inventor of Java 
 *  was ____________."
 *
 * @author mr callaghan
 * @version 07feb2024
 */

/*
 * The FillInQuestion class extends (i.e., is a subcalss of, is drived from) the Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * Do not declare instance variables for text and answer.  Thet text and the answer instance 
     *  variables are inherited from the Quesiton class.
     */
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the the question text AND answer.
     * 
     * @param questionText the text of the question, including the answer.
     */
    
    /*
     * Use the @Override annotation when overriding a method to signal to the compiler
     *  to verify that you are in fact overriding and not overloading the method.
     */
    @Override
    public void setText(String questionText)
    {
        
    }
    
}
