import java.util.Scanner;
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
     * Constructs a FIllInQuesiton object with the specified text that contains the answer.
     * 
     * @param question the specifeid quesiton text with the answer
     */
    public FillInQuestion(String question)
    {
        
    }
    
    
    
    /**
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text and answer.
     * 
     * @param questionText the text of the question, including the answer
     */
    /*
     * Use the @Override annotation when overriding a mehtod to signal to the complier
     *  to verify that you are in fact overriding the method.
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();  // "The inventor of Java is "
        String answer = parser.next();  // "James Gosling"
        question += "_______________" + parser.next();  // "________________."
        
        /*
         * The inherited instance variables are private; they cannot be accessed directly.
         *      We must use the mutator and accessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the 'super' reserved word to call the setText method defined in the superclass
         *      (e.g., Question)
         */
        super.setText(question);
        
        /*
         * We should use the 'this' reserved word to call the setAnswer method.  If the subclass 
         *      doesn't override the setAnswer method, the superclass's method will be called.
         *      
         *  We don't want to use the 'super' reserved word in this case, because if we
         *    override the setAnswer method, the overridden method woudl not be called.
         */
        this.setAnswer(answer);
        
    }
    
}







