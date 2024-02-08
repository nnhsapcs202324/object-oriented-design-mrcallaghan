import java.util.Scanner;
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
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();        // "The inventor of Java is 
        String answer = parser.next();          // "James Gosling"
        question += "___________" + parser.next();  // "______________."
        
        /*
         * The inherited instance variables are private; they cannot be accessed directly.
         *  We must use the mutator and accessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the 'super' reserved word to call the setText method as defined 
         *      in the superclass (e.g., Question)
         */
        super.setText(question);
        
        /*
         * We should use the 'this' reserved word to call the setAnswer method.  If the subclass
         *      doesn't override the setAnswer method, the superclass's method will be called.
         *      
         * We don't want to use the 'super' reserved word in this case, because if we later
         *  override the setAnswer method, the overriden method wouldn't be called.
         */
        this.setAnswer(answer);
        
    }
    
}
