import java.util.Scanner;
/**
 * A FillInQuestion is constructed with a string that contains the answer surrounded by
 *   "_". For example, "The inventor of Java is _James Gosling_."  The question should be 
 *   displayed as: "The inventor of Java is _______________."
 *
 * @author mrcallaghan
 * @version 07feb2024
 */

/*
 * The FillInQuestion class extends (i.e., is a subclass of, is derived from) the Question class.
 */
public class FillInQuestion extends Question
{
    /*
     * DO NOT declare the instance variables for the text and answer.
     * 
     * The text and answer instance variables are inherited from the Quesiton class.
     */
    
    /**
     * Constructs a FillInQuestion object with the specified text that contains the answer.
     * 
     * @param quesiton the specified quesiton text with the answer embedded
     */
    public FillInQuestion(String questionText)
    {
        
        /*
         * Explicitly call the Quesiton class's constructor taht takes a single parameter.
         *  Calling a superclass's constructor *must* be the first line of the code in
         *  the subclass's constructor.
         *  
         *  If we don't explicitly call a superclass's constructor, Java will automatically
         *      call the superclass's default (i.e., no parameters) constructor if it can.
         */
        super(questionText);
    }
    
    /*
     * This method overrides the setText method in the Question class.
     * 
     * Sets the question text and answer for a FillInQuestion.
     * 
     * @param questionText the text of the question, including the answer
     */
    @Override
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();  //  "The inventor of Java is "
        String answer = parser.next();  // "James Gosling"
        question += "_________________" + parser.next();  // "____________."
        
        /*
         * The inherited instance variables are private; they cannot be accessed directly.
         *      We must use the mutator and accessor methods.
         */
        //this.text = question;
        //this.answer = answer;
        
        /*
         * Use the "super" reserved word to call the setText method as defined in the 
         *      superclass (e.g., Question).
         */
        super.setText(question);
        
        /*
         * We should use 'this' reserved word to call the setAnswer method.  If the 
         *      subclass doesn't override the setAnswer method, the superclass's method
         *      will be called.
         *      
         *    We don't use the 'super' reserved word in this case, because if we later override the
         *      setAnswer method, the overridden method would not be called.
         */
        this.setAnswer(answer);
        
        
        
    }
}






