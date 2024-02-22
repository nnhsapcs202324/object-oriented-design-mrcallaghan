import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class demonstrates how to install an an action listener in a GUI app.
 *
 * @author mrcallaghan
 * @version 22feb2024
 */
public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JPanel panel;
    private JButton button;
    private JLabel label;
    
    private int clickCount;

    public ButtonViewer()
    {
        this.clickCount = 0;
        
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.button = new JButton("Click Me!");
        this.panel.add(this.button);
        
        this.label = new JLabel("0 clicks");
        this.panel.add(this.label);

        this.frame.add(this.panel);

        // 2. create listener objects
        ClickListener listener = new ClickListener();

        // 3. register listener object with the component that generates events
        this.button.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);

    }

    public class ClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            clickCount++;
            label.setText(clickCount + " clicks");
        }
    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }

}
