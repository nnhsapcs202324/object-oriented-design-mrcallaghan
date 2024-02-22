import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
/**
 * Demonstrates installing an action listener in a GUI app
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
    
    public ButtonViewer()
    {
        // 1. define and setup the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("click me");
        
        this.panel.add(this.button);
        this.frame.add(this.panel);
        
        // 2. create listener objects
        ClickListener listener = new ClickListener();
        
        // 3. register the listeners with the components that generate events
        this.button.addActionListener(listener);
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
        
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
