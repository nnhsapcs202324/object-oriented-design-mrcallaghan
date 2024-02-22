import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class ClickListener implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent event)
    {
        // 4. Respond to events that are generated
        System.out.println("Button clicked");
    }
}
