import java.util.ArrayList;
import java.util.Scanner;
/**
 * Class exam the "has a" list of Questions
 *
 * @author mrcallaghan
 * @version 09feb2024
 */
public class Exam
{
    /*
     * An exam object *has a* list of quesitons; an exam *is not a* Question
     */
    private ArrayList<Question> questions;
    
    public Exam()
    {
        this.questions = new ArrayList<Question>();
    }
    
    public void addQuestion(Question q)
    {
        this.questions.add(q);
    }
    
    public void askQuestions()
    {
        Scanner in = new Scanner(System.in);
        
        for(Question q:questions)
        {
            System.out.println( q.toString() );
            
            System.out.print("Your answer: ");
            String response = in.nextLine();
            
            System.out.println(q.checkAnswer(response));
        }
    }
}
